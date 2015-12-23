package Ch16.trashvisitor;
//:Valuminum.java
//Aluminum  for the visitor pattern
import Ch16.trash.*;
public class VAluminum extends Aluminum implements Visitable{
	public VAluminum(double wt){super(wt);}
	public void accept(Visitor v){
		v.visit(this);
	}
}
