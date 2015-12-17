package Ch9;
//Ignoring RuntimeExceptions

public class NeverCaught {
	static void f(){
		throw new RuntimeException("From f()");
	}
	static void g(){
		f();
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		g();
	}

}///:~
