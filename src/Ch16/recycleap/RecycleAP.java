package Ch16.recycleap;
//RecycleAP.java
//Recycling with RTTI and Prototypes
import Ch16.trash.*;
import java.util.*;
public class RecycleAP {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Vector bin = new Vector();
		//FIll up the Trash bin:
		ParseTrash.fillBin("Trash.txt", bin);
		Vector glassBin = new Vector(),
				paperBin = new Vector(),
				alBin = new Vector();
		Enumeration sorter = bin.elements();
		//Sort the Trash:
		while(sorter.hasMoreElements()){
			Object t = sorter.nextElement();
			//RTTI to show class membership:
			if(t instanceof Aluminum)
				alBin.addElement(t);
			if(t instanceof Paper)
				paperBin.addElement(t);
			if(t instanceof Glass)
				glassBin.addElement(t);
		}
		Trash.sumValue(alBin);
		Trash.sumValue(paperBin);
		Trash.sumValue(glassBin);
		Trash.sumValue(bin);
	}

}
