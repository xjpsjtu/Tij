package Ch12;
//:Stringer.java
public class Stringer {
	static String upcase(String s){
		return s.toUpperCase();
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String q = new String("howdy");
		System.out.println(q);
		String qq = upcase(q);
		System.out.println(qq);
		System.out.println(q);
	}

}
