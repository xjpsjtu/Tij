package Ch4;
//:Flower.java
//Calling constructors with "this"
public class Flower {
	private int petalCount = 0;
	private String s =new String("null");
	
	public Flower(int petals){
		petalCount = petals;
		System.out.println("Constructor int arg only,petalCount = "+petals);
	}
	
	public Flower(String ss){
		System.out.println("Constructor String arg only, s = "+ss);
	}
	
	public Flower(String s, int petals){
		this(petals);
		//!this(s);	//Can't call two!
		this.s=s;
		System.out.println("String & int args");
	}
	
	public Flower(){
		this("hi",47);
		System.out.println("default constructor(no args)");
	}
	
	public void print(){
		//!this(11) //Not inside non-constructor!
		System.out.println("petalCount = "+ petalCount+"s="+s);
	}
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Flower x =new Flower();
		x.print();
	}

}///:~
