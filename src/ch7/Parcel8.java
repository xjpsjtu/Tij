package ch7;
//:Parcel8.java
//An anonymous inner class that performs initialization. A briefer version of Parcel5.java
public class Parcel8 {
	//Argument must be final to use inside
	//anonymous inner class:
	public Destination dest(final String dest){
		return new Destination(){
			private String label = dest;
			public String readLabel(){
				return label;
			}
		};
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Parcel8 p = new Parcel8();
		Destination d = p.dest("Tanzania");
	}

}
