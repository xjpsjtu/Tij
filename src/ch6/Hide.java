package ch6;
//:Hide.java
//Overloading a base-class method name
//in a derived class does not hide the base-class versions

class Homer{
		char doh(char c){
		System.out.println("doh(char)");
		return 'd';
	}
		float doh(float f){
		System.out.println("doh(float)");
		return 1.0f;
	}
}

class Milhouse{}

class Bart extends Homer{
	void doh(Milhouse m ){}
}
public class Hide {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Bart b = new Bart();
		b.doh(1);
		b.doh('x');
		b.doh(1.0f);
		b.doh(new Milhouse());
	}

}///~
