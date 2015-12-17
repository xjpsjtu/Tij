package ch14;
class Info{
	String name = "XJP";
	int age = 20;
	public void setInfo(Info info){
		this.name = info.name;
		this.age = info.age;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
}

class Producer implements Runnable{
	boolean flag;
	Info info;
	public Producer(Info info){
		this.info = info;
	}
	public synchronized void setInfo(String name, int age){
		this.info.setName(name);
		try{
			Thread.sleep(150);
		}catch(InterruptedException e){}
		this.info.setAge(age);
		if(flag)
			flag = false;
		else flag = true;
	}
	public void run(){
		flag = false;
		for(int i = 0; i < 25; i++){
			if(flag){
				setInfo("XJP", 20);
//				flag = false;
			}else{
				setInfo("WWW", 100);
//				flag = true;
			}
		}
	}
}
class Consumer implements Runnable{
	Info info;
	public Consumer(Info info){
		this.info = info;
	}
	public void run(){
		for(int i = 0; i < 25; i++){
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){}
			System.out.println(this.info.getName()+"------"+this.info.getAge());
		}
	}
}
public class ThreadTest {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Info info = new Info();
		Producer pro = new Producer(info);
		Consumer com = new Consumer(info);
		new Thread(pro).start();
		new Thread(com).start();
	}

}
