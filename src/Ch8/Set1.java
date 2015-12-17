package Ch8;
//:Set1.java
//Things you can do with Sets
import java.util.*;

public class Set1 {
	public static void testVisual(Set a){
		Collection1.fill(a);
		Collection1.fill(a);
		Collection1.fill(a);
//		System.out.println("1");
		Collection1.print(a);//No duplicates
		//Add another set to this one:
		a.addAll(a);
		a.add("one");
		a.add("one");
		a.add("one");
//		System.out.println("2");
		Collection1.print(a);
		//Look something up:
		System.out.println("a.contains(\"one\"):"+a.contains("one"));
	}
	public static void main(String[] args){
		testVisual(new HashSet());
		testVisual(new TreeSet());
	}
}
