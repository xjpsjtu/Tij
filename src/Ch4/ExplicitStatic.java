package Ch4;
//:ExplicitStatic.java
//Explicit static initialization
//with the "static" clause

class Cup{
	Cup(int marker){
		System.out.println("Cup("+marker+")");
	}
	void f(int marker){
		System.out.println("f("+marker+")");
	}
}

class Cups{
	static Cup c1;
	static Cup c2;
	static{
		c1 = new Cup(1);
		c2 = new Cup(2);
		System.out.println("all initialized");
	}
	Cups(){
		System.out.println("Cups");
	}
}
public class ExplicitStatic {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("Inside main()");
		Cups.c1.f(99);
//		Cups x = new Cups();
	}
	static Cups x = new Cups();
	static Cups y = new Cups();
}///"~
