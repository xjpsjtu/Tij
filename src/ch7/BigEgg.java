package ch7;
//:BigEgg.java
//An inner class cannot be overriden like a method
class Egg{
	protected class Yolk{
		public Yolk(){
			System.out.println("Egg.Yolk()");
		}
	}
	private Yolk y;
	public Egg(){
		System.out.println("New Egg()");
		y = new Yolk();
	}
}
public class BigEgg extends Egg{
	public class Yolk{
		public Yolk(){
			System.out.println("BigEgg.Yolk()");
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new BigEgg();
//		new Egg();
		//System.out.println("OK");
	}

}
