package Ch12;
//:ImmutableInteger.java
//The Integer class cannot be changed
import java.util.*;

public class ImmutableInteger {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Vector v = new Vector();
		for(int i = 0; i < 10; i++)
			v.addElement(new Integer(i));
		//But now do you change the int inside the Integer
	}

}
