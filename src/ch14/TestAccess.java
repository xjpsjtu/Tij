package ch14;
//:TestAccess.java
//How Threads can access other threads in a parent thread group
public class TestAccess {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ThreadGroup
			x = new ThreadGroup("xx"),
			y = new ThreadGroup(x, "yy"),
			z = new ThreadGroup(y, "zz");
		Thread
			one = new TestThread1(x, "oneone"),
			two = new TestThread2(z, "twotwo");
	}

}
class TestThread1 extends Thread{
	private int i;
	TestThread1(ThreadGroup g, String name){
		super(g, name);
	}
	void f(){
		i++; //modify this thread;
		System.out.println(getName() + " f()");
	}
}
class TestThread2 extends TestThread1{
	TestThread2(ThreadGroup g, String name){
		super(g, name);
		start();
	}
	public void run(){
		ThreadGroup g = getThreadGroup().getParent().getParent();
		g.list();
		Thread[] gAll = new Thread[g.activeCount()];
		g.enumerate(gAll);
		for(int i = 0; i < gAll.length; i++){
			gAll[i].setPriority(Thread.MIN_PRIORITY);
			((TestThread1)gAll[i]).f();
		}
		g.list();
	}
}
