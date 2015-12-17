package Ch12;
//:MutableInteger.java
//A changeable wrapper class
import java.util.*;
class IntValue{
	int n;
	IntValue(int x){n = x;}
	public String toString(){
		return Integer.toString(n);
	}
}
public class MutableInteger {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Vector v = new Vector();
		for(int i = 0; i < 10; i++)
			v.addElement(new IntValue(i));
		System.out.println(v);
		for(int i = 0; i < 10; i++)
			((IntValue)v.elementAt(i)).n++;
		System.out.println(v);
	}

}
