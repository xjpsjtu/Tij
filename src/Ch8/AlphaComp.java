package Ch8;
//:AlphaComp.java
//Using Comparator to perform an alphabetic sort
import java.util.*;

public class AlphaComp implements Comparator{
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String[] s = Array1.randStrings(4, 10);
		Array1.print(s);
		AlphaComp ac = new AlphaComp();
		Arrays.sort(s,ac);
		Array1.print(s);
		//Must use the Comparator to search, also:
		int loc = Arrays.binarySearch(s, s[3],ac);
		System.out.println("Location of "+s[3]+" = "+loc);
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO 自动生成的方法存根
		//Assume it's used only for String...
		String s1 = ((String)o1).toLowerCase();
		String s2 = ((String)o2).toLowerCase();
		return s1.compareTo(s2);
	}

}///:~
