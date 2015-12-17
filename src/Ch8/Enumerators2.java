package Ch8;
//:Enumerators2.java
//Revisiting Enumerations
import java.util.*;

class PringData{
	static void print(Enumeration e){
		while(e.hasMoreElements()){
			System.out.println(e.nextElement().toString());
		}
	}
}

public class Enumerators2 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Vector v = new Vector();
		for(int i = 0; i < 5; i++){
			v.addElement(new Mouse(i));
		}
		
		Hashtable h = new Hashtable();
		for(int i = 0; i < 5; i++){
			h.put(new Integer(i), new Hamster(i));
		}
		System.out.println("Vector");
		PringData.print(v.elements());
		System.out.println("Hashtable");
		PringData.print(h.elements());
	}

}
