package ch6;
//:Detergent.java
//Inheritance syntax & properties
public class Detergent extends Cleanser {
	public Detergent(){
		//System.out.println("Detergent consturctor");
	}
	//Change a method
	public void scrub(){
		append("Detergent.scrub()");
		super.scrub();
	}
	//add methods to the interface
	public void foam(){append("foam()");}
	//test the new class
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		x.print();
		System.out.println("Testing base class:");
		Cleanser.main(args);
	}

}///~

class Cleanser{
	public Cleanser(){
		System.out.println("Cleanser construction");
	}
	private String s = new String("Cleaner");
	public void append(String a){s += a;}
	public void dilute(){ append("dilute()");}
	public void apply(){ append("apply()");}
	public void scrub(){ append("scrub()");}
	public void print(){System.out.println(s);}
	public static void main(String[] args){
		Cleanser x = new Cleanser();
		x.dilute();x.apply();x.scrub();
		x.print();
	}
}