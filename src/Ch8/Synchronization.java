package Ch8;
//:Synchronization.java
//Using the Collections.synchronized methods
import java.util.*;

public class Synchronization {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Collection c = Collections.synchronizedCollection(new ArrayList());
		List list = Collections.synchronizedList(new ArrayList());
		Set s = Collections.synchronizedSet(new HashSet());
		Map m = Collections.synchronizedMap(new HashMap());
	}

}///:~
