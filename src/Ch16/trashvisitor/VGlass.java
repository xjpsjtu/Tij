package Ch16.trashvisitor;
//:VGlass.java
//VGlass  for the visitor pattern
import Ch16.trash.*;
public class VGlass extends Glass implements Visitable{
	public VGlass(double wt){super(wt);}
	public void accept(Visitor v){
		v.visit(this);
	}
}
