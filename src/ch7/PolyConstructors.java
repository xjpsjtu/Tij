package ch7;
//:PolyConstructors.java
//Constructors and polymorphism don't produce what you might expect
abstract class Glyph{
	abstract void draw();
	Glyph(){
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}
class RoundGlyph extends Glyph{
	int radius = 1;
	RoundGlyph(int r){
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph(), radius = "+radius);
	}
	void draw(){
		System.out.println("RoundGlyph.draw(), radius = "+radius);
	}
}
public class PolyConstructors {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new RoundGlyph(5);
	}

}///~
