package ch7;
//:Parcel6.java
//A method that returns an anonymous inner class
public class Parcel6 {
	public Contents cont(){
		return new Contents(){
			private int i = 11;
			public int value(){
				return i;
			}
		};
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Parcel6 p = new Parcel6();
		//Contents c = new Contents();
		Contents c = p.cont();
	}

}
