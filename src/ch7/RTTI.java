package ch7;
//:RTTI.java
//Downcasting & Run-Time Type
import java.util.*;
class Useful{
	public void f(){}
	public void g(){}
}
class MoreUseful extends Useful{
	public void f(){}
	public void g(){}
	public void u(){}
	public void v(){}
	public void w(){}
}
public class RTTI {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Useful[] x = {new Useful(), new MoreUseful()};
		x[0].f();
		x[1].g();
		//Compile-time:method not found in Useful:
		//x[1].u();
		((MoreUseful)x[1]).u();
		//((MoreUseful)x[0]).u();
	}

}///~
