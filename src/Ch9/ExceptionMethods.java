package Ch9;
//Demonstrating the Exception Methods

public class ExceptionMethods {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
			throw new Exception("Here's my Exception");
		} catch (Exception e) {
			System.out.println("Caught Exception");
			System.out.println(
					"e.getMessage(): "+e.getMessage());
			System.out.println("e.toString(): "+e.toString());
			System.out.print("e.printlnStackTrace(): ");
			e.printStackTrace();
		}
	}

}///:~
