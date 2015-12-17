package Ch8;
//:ListSort.java
//Sorting and searching Lists with 'Collection'
import java.util.*;

public class ListSort {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		final int SZ = 20;
		//Using "natural comparison method":
		List a = new ArrayList();
		for(int i = 0; i < SZ; i++)
			a.add(new CompClass(
					(int)(Math.random()*100)));
		Collection1.print(a);
		Collections.sort(a);
		Collection1.print(a);
		Object find = a.get(SZ/2);
		int loc = Collections.binarySearch(a, find);
		System.out.println("Location of "+find+" = "+loc);
		//Using a comparator:
		List b = new ArrayList();
		for(int i = 0; i < SZ; i++)
			b.add(Array1.randString(4));
		Collection1.print(b);
		AlphaComp ac = new AlphaComp();
		Collections.sort(b,ac);
		Collection1.print(b);
	}

}
