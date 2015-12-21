package Ch16;
//:SingletonPattern.java
//The SingletonPattern design pattern: you can never instantiate more than one
//Since this isn't inherited  from Cloneable base class and cloneability isn't added, making it
//final prevents cloneability from being added in any derived classes:
final class Singleton{
	private static Singleton s = new Singleton(47);
	private int i;
	private Singleton(int x){ i = x;}
	public static Singleton getHandle(){
		return s;
	}
	public int getValue(){ return i;}
	public void setValue(int x){i = x;}
}
public class SingletonPattern {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Singleton s = Singleton.getHandle();
		System.out.println(s.getValue());
		Singleton s2 = Singleton.getHandle();
		s2.setValue(9);
		System.out.println(s.getValue());
		try{
			//Can't do this:compile-time error.
			//Singleton s3 = (Singleton)s2.clone();
			//Singleton s3 = new Singleton();
		}catch(Exception e){}
	}

}
