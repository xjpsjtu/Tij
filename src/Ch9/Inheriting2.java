package Ch9;
//:Inheriting2.java
//Inheriting your own exceptions

class MyException2 extends Exception{
	public MyException2(){}
	public MyException2(String msg){
		super(msg);
	}
	public MyException2(String msg, int x){
		super(msg);
		i = x;
	}
	public int val(){
		return i;
	}
	private int i;
}
public class Inheriting2 {
	public static void f() throws MyException2{
		System.out.println("Throwing MyException2 from f()");
		throw new MyException2();
	}
	public static void g() throws MyException2{
		System.out.println("Throwing MyException2 from g()");
		throw new MyException2("Originated in g()");
	}
	public static void h() throws MyException2{
		System.out.println("Throwing MyException2 from h()");
		throw new MyException2("Originated in h()", 47);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
			f();
		} catch (MyException2 e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		try {
			g();
		} catch (MyException2 e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		try {
			h();
		} catch (MyException2 e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			System.out.println("e.val() = "+e.val());
		}
	}

}///:~
