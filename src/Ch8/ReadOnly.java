package Ch8;
//:ReadOnly.java
//Using the Collections.unmodifiable methods
import java.util.*;

public class ReadOnly {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Collection c = new ArrayList();
		Collection1.fill(c);//Insert useful data
		c = Collections.unmodifiableCollection(c);
		Collection1.print(c);//Reading is OK
//		c.add("one");
//		c.clear();
	}

}
