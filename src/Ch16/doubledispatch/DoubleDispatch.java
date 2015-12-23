package Ch16.doubledispatch;
//:DoubleDispatch.java
//Using multiple dispatching to handle more than unknown type during a method call
import Ch16.trash.*;
import java.util.*;
class AluminumBin extends TypedBin{
	public boolean add(DDAluminum a){
		return addIt(a);
	}
}
class PaperBin extends TypedBin{
	public boolean add(DDPaper a){
		return addIt(a);
	}
}
class GlassBin extends TypedBin{
	public boolean add(DDGlass a){
		return addIt(a);
	}
}
class CardboardBin extends TypedBin{
	public boolean add(DDCardboard a){
		return addIt(a);
	}
}
class TrashBinSet{
	private TypedBin[] binSet = {
			new AluminumBin(),
			new PaperBin(),
			new GlassBin(),
			new CardboardBin()
	};
	public void sortIntoBins(Vector bin){
		Enumeration e = bin.elements();
		while(e.hasMoreElements()){
			TypedBinMember t = (TypedBinMember)e.nextElement();
			if(!t.addToBin(binSet))
				System.err.println("Couldn't add " + t);
		}
	}
	public TypedBin[] binSet(){
		return binSet;
	}
}
public class DoubleDispatch {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Vector bin = new Vector();
		TrashBinSet bins = new TrashBinSet();
		//ParseTrash still works, without changes:
		ParseTrash.fillBin("DDTrash.txt", bin);
		//SOrt form the master bin into the individually-typed bins:
		bins.sortIntoBins(bin);
		TypedBin[] tb = bins.binSet();
		//Perform sumValue for each bin
		for(int i = 0; i < tb.length; i++)
			Trash.sumValue(tb[i].v);
		Trash.sumValue(bin);
	}

}
