package ch14;
//:ThreadGroup1.java
//How thread groups control priorities of the threads inside them
public class ThreadGroup1 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//Get the system thread & print its Info
		ThreadGroup sys = Thread.currentThread().getThreadGroup();
		sys.list();
		System.out.println("------------------");
		//Reduce the system thread group priority:
		sys.setMaxPriority(Thread.MAX_PRIORITY-1);
		//Increase the main thread priority:
		Thread curr = Thread.currentThread();
		curr.setPriority(curr.getPriority() + 1);
		sys.list();
		System.out.println("------------------");
		//Attempt to set a new group to the max:
		ThreadGroup g1 = new ThreadGroup("g1");
		g1.setMaxPriority(Thread.MAX_PRIORITY);
		//Attempt to set a new thread to the max:
		Thread t = new Thread(g1, "A");
		t.setPriority(Thread.MAX_PRIORITY);
		g1.list();
		System.out.println("------------------");
		//Reduce g1's max priority, then attempt to increase it:
		g1.setMaxPriority(Thread.MAX_PRIORITY - 2);
		g1.setMaxPriority(Thread.MAX_PRIORITY);
		g1.list();
		System.out.println("------------------");
		t = new Thread(g1, "B");
		t.setPriority(Thread.MAX_PRIORITY);
		g1.list();
		System.out.println("------------------");
		sys.list();
		System.out.println("------------------");
		System.out.println("Starting all threads");
		Thread[] all = new Thread[sys.activeCount()];
		sys.enumerate(all);
		for(int i = 0; i < all.length; i++)
			if(!all[i].isAlive())
				all[i].start();
		System.out.println("All threads started");
//		sys.suspend();
//		System.out.println("All threads suspended");
		sys.stop();
		System.out.println("All threads stopped");
	}

}
