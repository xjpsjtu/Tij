package Ch8;
//:SpringDetector2.java
//If you create a class that's used as a key in a Hashtable,
//you must override hashCode() and equals()
import java.util.*;

class Groundhog2{
	int ghNumber;
	Groundhog2(int n){ghNumber = n;}
	public int hashCode(){return ghNumber;}
	public boolean equals(Object o){
		return (o instanceof Groundhog2) && (ghNumber == ((Groundhog2)o).ghNumber);
	}
}
public class SpringDetector2 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Hashtable ht = new Hashtable();
		for(int i = 0; i < 10; i++){
			ht.put(new Groundhog2(i), new Prediction());
		}
		System.out.println("ht = "+ht+"\n");
		System.out.println("Looking up prediction for goundhod #3: ");
		Groundhog2 gh = new Groundhog2(3);
		if(ht.containsKey(gh))
			System.out.println((Prediction)ht.get(gh));
	}

}
