package ch7;
//:Transmogrify.java
//Dynamically changing the behavior of an object via composition

interface Actor{
	void act();
}
class HappyActor implements Actor{
	public void act(){
		System.out.println("Happy Actor");
	}
}
class SadActor implements Actor{
	public void act(){
		System.out.println("Sad Actor");
	}
}
class Stage{
	Actor a = new HappyActor();
	void change(){
		a = new SadActor();
	}
	void go(){
		a.act();
	}
}
public class Transmogrify {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Stage s = new Stage();
		s.go();
		s.change();
		s.go();
	}

}///~
