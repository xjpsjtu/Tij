package Ch11;
//:PetCount.java
//Using instanceof
import java.util.*;
class Pet{}
class Dog extends Pet{}
class Cat extends Pet{}
class Pug extends Pet{}
class Rodent extends Pet{}
class Gerbil extends Rodent{}
class Hamster extends Rodent{}

class Counter{ int i=0;}
public class PetCount {
	static String[] typenames = {
		"Pet", "Dog", "Pug", "Cat", "Rodent", "Gerbil", "Hamster",
	};
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Vector pets = new Vector();
		try{
			Class[] petTypes = {
					Class.forName("Ch11.Dog"),
					Class.forName("Ch11.Pug"),
					Class.forName("Ch11.Cat"),
					Class.forName("Ch11.Rodent"),
					Class.forName("Ch11.Gerbil"),
					Class.forName("Ch11.Hamster"),
			};
			for(int i = 0; i < 15; i++)
				pets.addElement(
						petTypes[
						         (int)(Math.random()*petTypes.length)].newInstance());
		}catch(InstantiationException e){}
		 catch(IllegalAccessException e){}
		 catch(ClassNotFoundException e){}
		Hashtable h = new Hashtable();
		for(int i = 0; i < typenames.length; i++)
			h.put(typenames[i], new Counter());
		for(int i = 0; i < pets.size(); i++){
			Object o = pets.elementAt(i);
			if(o instanceof Pet)
				((Counter)h.get("Pet")).i++;
			if(o instanceof Dog)
				((Counter)h.get("Dog")).i++;
			if(o instanceof Pug)
				((Counter)h.get("Pug")).i++;
			if(o instanceof Cat)
				((Counter)h.get("Cat")).i++;
			if(o instanceof Rodent)
				((Counter)h.get("Rodent")).i++;
			if(o instanceof Gerbil)
				((Counter)h.get("Gerbil")).i++;
			if(o instanceof Hamster)
				((Counter)h.get("Hamster")).i++;
		}
//		System.out.println(pets);
//		System.out.println("------------------------");
		for(int i = 0; i < pets.size(); i++)
			System.out.println(pets.elementAt(i).getClass().toString());
		for(int i = 0; i < typenames.length; i++)
			System.out.println(typenames[i]+" quantity: "+((Counter)h.get(typenames[i])).i);
	}

}///:~





















