package Ch11;
//:PetCount2.java
//Using java 1.1 class literals
import java.util.*;

class Pet2{}
class Dog2 extends Pet2{}
class Cat2 extends Pet2{}
class Pug2 extends Pet2{}
class Rodent2 extends Pet2{}
class Gerbil2 extends Rodent2{}
class Hamster2 extends Rodent2{}

class Counter2{ int i;}

public class PetCount2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Vector pets = new Vector();
		Class[] petTypes = {
				//Class literals work in Java 1.1+ only:
				Pet2.class,
				Dog2.class,
				Pug2.class,
				Cat2.class,
				Rodent2.class,
				Gerbil2.class,
				Hamster2.class,
		};
		try{
			for(int i = 0; i < 15; i++){
				//Offset by one to eliminate Pet.class:
				int rnd = 1 + (int)(Math.random()*(petTypes.length-1));
				pets.addElement(petTypes[rnd].newInstance());
			}
		}catch(InstantiationException e){}
		catch(IllegalAccessException e){}
		Hashtable h = new Hashtable();
		for(int i = 0; i < petTypes.length; i++)
			h.put(petTypes[i].toString(), new Counter2());
		for(int i = 0; i < petTypes.length; i++){
			Object o = pets.elementAt(i);
			if(o instanceof Pet2)
				((Counter2)h.get("class Ch11.Pet2")).i++;
			if(o instanceof Dog2)
				((Counter2)h.get("class Ch11.Dog2")).i++;
			if(o instanceof Pug2)
				((Counter2)h.get("class Ch11.Pug2")).i++;
			if(o instanceof Cat2)
				((Counter2)h.get("class Ch11.Cat2")).i++;
			if(o instanceof Rodent2)
				((Counter2)h.get("class Ch11.Rodent2")).i++;
			if(o instanceof Gerbil2)
				((Counter2)h.get("class Ch11.Gerbil2")).i++;
			if(o instanceof Hamster2)
				((Counter2)h.get("class Ch11.Hamster2")).i++;
		}
		System.out.println(pets);
		System.out.println("--------------------");
		System.out.println(h);
		System.out.println("---------------------");
		for(int i = 0; i < pets.size(); i++)
			System.out.println(pets.elementAt(i).getClass().toString());
		Enumeration keys = h.keys();
		while(keys.hasMoreElements()){
			String nm = (String)keys.nextElement();
			Counter2 cnt = (Counter2)h.get(nm);
			System.out.println(nm.substring(nm.lastIndexOf('.')+1)+" quantity: "+cnt.i);
		}
	}

}///:~
