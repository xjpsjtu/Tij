package Ch8;
//:AssocArray.java
//Simple version of a Dictionary
import java.util.*;

public class AssocArray extends Dictionary{
	private Vector keys = new Vector();
	private Vector values = new Vector();
	public int size(){
		return keys.size();
	}
	public boolean isEmpty(){
		return keys.isEmpty();
	}
	public Object put(Object key, Object value){
		keys.addElement(key);
		values.add(value);
		return key;
	}
	public Object get(Object key){
		int index = keys.indexOf(key);
		//indexOf() Returns if key not found:
		if(index == -1)return null;
		return values.elementAt(index);
	}
	public Object remove(Object key){
		int index = keys.indexOf(key);
		if(index == -1)return null;
		keys.remove(index);
		Object returnval = values.elementAt(index);
		values.removeElementAt(index);
		return returnval;
	}
	public Enumeration keys(){
		return keys.elements();
	}
	public Enumeration elements(){
		return values.elements();
	}
	//Test it
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		AssocArray aa = new AssocArray();
		for(char c = 'a'; c <= 'z'; c++){
			aa.put(String.valueOf(c), String.valueOf(c).toUpperCase());
		}
		char[] ca = {'a', 'e', 'i', 'o', 'u'};
		for(int i = 0; i < ca.length; i++){
			System.out.println("Uppercase: "+aa.get(String.valueOf(ca[i])));
		}
	}

}
