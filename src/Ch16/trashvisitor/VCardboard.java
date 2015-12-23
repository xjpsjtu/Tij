package Ch16.trashvisitor;
//:VCardboard.java
//VCardboard  for the visitor pattern
import Ch16.trash.*;
public class VCardboard extends Cardboard implements Visitable{
	public VCardboard(double wt){super(wt);}
	public void accept(Visitor v){
		v.visit(this);
	}
}
