package Ch12;
//:Immutable2.java
//A companion class for making changes to immutable objects.
class Mutable{
	private int data;
	public Mutable(int initVal){
		data = initVal;
	}
	public Mutable add(int x){
		data += x;
		return this;
	}
	public Mutable multiply(int x){
		data *= x;
		return this;
	}
	public Immutable2 makeImmutable2(){
		return new Immutable2(data);
	}
}
public class Immutable2 {
	private int data;
	public Immutable2(int initVal){
		data = initVal;
	}
	public int read(){
		return data;
	}
	public boolean nonzero(){
		return data != 0;
	}
	public Immutable2 add(int x){
		return new Immutable2(data + x);
	}
	public Immutable2 multiply(int x){
		return new Immutable2(data * x);
	}
	public Mutable makeMutable(){
		return new Mutable(data);
	}
	public static Immutable2 modify1(Immutable2 y){
		Immutable2 val = y.add(12);
		val = val.multiply(3);
		val = val.add(11);
		val = val.multiply(2);
		return val;
	}
	public static Immutable2 modify2(Immutable2 y){
		Mutable m = y.makeMutable();
		m.add(2).multiply(3).add(11).multiply(2);
		return m.makeImmutable2();
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Immutable2 i2 = new Immutable2(47);
		Immutable2 r1 = modify1(i2);
		System.out.println("i2 = "+i2.read());
		System.out.println("r1 = "+r1.read());
		
	}

}
