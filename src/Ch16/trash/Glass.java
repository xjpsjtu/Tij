package Ch16.trash;
//:Glass.java
//The Glass class with prototyping 

public class Glass extends Trash{
	private static double val = 1.67f;
	public Glass(double wt){super(wt);}
	public double value(){return val;}
	public static void value(double newVal){
		val = newVal;
	}
}
