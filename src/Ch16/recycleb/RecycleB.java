package Ch16.recycleb;
//:RecycleB.java
//Adding more objects to the recycling problem
import Ch16.trash.*;
import java.util.*;
//A vector that admits only the right type:
class Tbin extends Vector{
	Class binType;
	Tbin(Class binType){
		this.binType = binType;
	}
	boolean grab(Trash t){
		//Comparing class types:
		if(t.getClass().equals(binType)){
			addElement(t);
			return true; //Object grabbed
		}
		return false; //Object not grabbed
	}
}
class TbinList extends Vector{
	boolean sort(Trash t){
		Enumeration e = elements();
		while(e.hasMoreElements()){
			Tbin bin = (Tbin)e.nextElement();
			if(bin.grab(t))return true;
		}
		return false; //bin not found for t
	}
	void sortBin(Tbin bin){
		Enumeration e = bin.elements();
		while(e.hasMoreElements())
			if(!sort((Trash)e.nextElement()))
				System.out.println("Bin not found");
	}
}
public class RecycleB {
	static Tbin bin = new Tbin(Trash.class);
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//Fill up the Trash bin:
		ParseTrash.fillBin("Trash.txt", bin);
		TbinList trashBins = new TbinList();
		trashBins.addElement(new Tbin(Aluminum.class));
		trashBins.addElement(new Tbin(Paper.class));
		trashBins.addElement(new Tbin(Glass.class));
		trashBins.addElement(new Tbin(Cardboard.class));
		trashBins.sortBin(bin);
		Enumeration e = trashBins.elements();
		while(e.hasMoreElements()){
			Tbin b = (Tbin)e.nextElement();
			Trash.sumValue(b);
		}
		Trash.sumValue(bin);
	}

}
