package Ch16.doubledispatch;
//:DDCardboard.java
//Cardboard for double dispatching
import Ch16.trash.*;
public class DDCardboard extends Cardboard implements TypedBinMember{
	public DDCardboard(double wt){super(wt);}
	public boolean addToBin(TypedBin[] tb){
		for(int i = 0; i < tb.length; i++)
			if(tb[i].add(this))
				return true;
		return false;
	}
}///��~
