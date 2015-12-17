package ch7;
//:InheritInner.java
//Inheriting an inner class

class WithInner{
	class Inner{}
}
public class InheritInner extends WithInner.Inner{
	//InheritInner(){}
	InheritInner(WithInner wi){
		wi.super();
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		WithInner wi = new WithInner();
		InheritInner ii = new InheritInner(wi);
	}

}
