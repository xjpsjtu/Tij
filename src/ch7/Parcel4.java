package ch7;
//:parcel4.java
//Nesting a class within a method

interface Destination{
	String readLabel();
}

interface Contents{
	int value();
}

class Wrapping{
	private int i;
	public Wrapping(int x){
		i=x;
	}
	public int value(){
		return i;
	}
}
public class Parcel4 {
	public Destination dest(String s){
		class PDestination implements Destination{
			private String label;
			private PDestination(String whereTo){
				label = whereTo;
			}
			public String readLabel(){
				return label;
			}
		}
		return new PDestination(s);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Parcel4 p = new Parcel4();
		Destination d = p.dest("Tanzania");
	}

}
