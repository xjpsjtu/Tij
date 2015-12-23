package Ch16.doubledispatch;
//:DDAluminum.java
//Aluminum for double dispatching
import Ch16.trash.*;
public class DDAluminum extends Aluminum implements TypedBinMember{
	public DDAluminum(double wt){super(wt);}
	public boolean addToBin(TypedBin[] tb){
		for(int i = 0; i < tb.length; i++)
			if(tb[i].add(this))
				return true;
		return false;
	}
}///��~
