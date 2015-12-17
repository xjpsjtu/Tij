package Ch11;
//:SweetShop.java
//Examination of the way the class loader works

class Candy{
	static{
		System.out.println("Loading Candy");
	}
}
class Gum{
	static{
		System.out.println("Loading Gum");
	}
}
class Cookie{
	static{
		System.out.println("Loading Cookie");
	}
}
public class SweetShop {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("inside main");
		new Candy();
//		new Candy();
		System.out.println("After creating Candy");
		try{
			Class.forName("Ch11.Gum");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		System.out.println("After Class.forName(\"Gum\")");
		new Cookie();
		System.out.println("After creating Cookie");
	}

}
