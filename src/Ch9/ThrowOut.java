package Ch9;
//:ThrowOut.java

public class ThrowOut {
	public static void main(String[] args) throws Throwable{
		// TODO �Զ����ɵķ������
		try{
			throw new Throwable();
		}catch(Exception e){
			System.out.println("Caught in main");
		}
	}

}
