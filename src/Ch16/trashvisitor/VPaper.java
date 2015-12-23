package Ch16.trashvisitor;
//:VPaper.java
//VPaper  for the visitor pattern
import Ch16.trash.*;
public class VPaper extends Paper implements Visitable{
	public VPaper(double wt){super(wt);}
	public void accept(Visitor v){
		v.visit(this);
	}
}
