package Ch9;
//:Inheriting.java
//Inheriting your own exceptions

class MyException extends Exception{
	public MyException(){}
	public MyException(String msg){
		super(msg);
	}
}

public class Inheriting {
	public static void f() throws MyException{
		System.out.println("Throwing MyException from f() ");
		throw new MyException();
	}
	public static void g() throws MyException{
		System.out.println("Throwing MyException from g() ");
		throw new MyException("Originated in g() ");
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
			f();
		} catch (MyException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		try {
			g();
		} catch (MyException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}///:~
