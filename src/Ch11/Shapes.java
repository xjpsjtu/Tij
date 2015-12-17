package Ch11;
//Shapes.java
import java.util.*;

interface Shape{
	void draw();
}
class Circle implements Shape{
	public void draw(){
		System.out.println("Circle.draw()");
	}
}
class Square implements Shape{
	public void draw(){
		System.out.println("Square.draw()");
	}
}
class Triangle implements Shape{
	public void draw(){
		System.out.println("Triangle.draw()");
	}
}
public class Shapes {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Vector s = new Vector();
		s.addElement(new Circle());
		s.addElement(new Square());
		s.addElement(new Triangle());
		Enumeration e = s.elements();
		while(e.hasMoreElements())
			((Shape)e.nextElement()).draw();
	}

}///:~
