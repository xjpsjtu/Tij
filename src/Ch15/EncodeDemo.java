package Ch15;
//:EcnodeDemo.java
//Demonstration of URLEncoder.encode()
import java.net.*;
public class EncodeDemo {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String s = "";
		for(int i = 0; i < args.length; i++)
			s += args[i] + " ";
		s = URLEncoder.encode(s.trim());
		System.out.println(s);
	}

}
