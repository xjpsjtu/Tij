package Ch8;
//:StringSortTest.java
//Testing the generic sorting Vector
import java.util.*;

public class StringSortTest {
	static class StringCompare implements Compare{

		@Override
		public boolean lessThan(Object lhs, Object rhs) {
			// TODO 自动生成的方法存根
			return ((String)lhs).toLowerCase().compareTo(((String)rhs).toLowerCase())<0;
		}

		@Override
		public boolean lessThanOrEqual(Object lhs, Object rhs) {
			// TODO 自动生成的方法存根
			return ((String)lhs).toLowerCase().compareTo(((String)rhs).toLowerCase())<=0;
		}
		
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SortVector sv = new SortVector(new StringCompare());
		sv.addElement("d");
		sv.addElement("A");
		sv.addElement("C");
		sv.addElement("c");
		sv.addElement("b");
		sv.addElement("B");
		sv.addElement("D");
		sv.addElement("a");
		sv.sort();
		Enumeration e =sv.elements();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		
	}

}///:~
