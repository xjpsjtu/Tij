package Ch12;
//:ImmutableStrings.java
//Demonstrating StringBuffer
public class ImmutableStrings {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String foo = "foo";
		String s = "abc"+foo+"def"+Integer.toString(47);
		System.out.println(s);
		StringBuffer sb = new StringBuffer("abc");
		sb.append(foo);
		sb.append("def");
		sb.append(Integer.toString(47));
		System.out.println(sb);
	}

}
