package Ch9;
//:Rethrowing.java
//Demonstrating fillInStackTrace()

public class Rethrowing {
	public static void f() throws Exception{
		System.out.println("originating the exception if f()");
		throw new Exception("thrown from f()");
	}
	public static void g() throws Throwable{
		try {
			f();
		} catch (Exception e) {
			System.out.println("Inside g(), e.printStackTrace()");
			e.printStackTrace();
			throw e;
//			throw e.fillInStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
			g();
		} catch (Throwable e) {
			System.out.println("Caught in main, e.printStackTrace()");
			e.printStackTrace();
		}
	}

}
