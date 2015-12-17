package Ch12;
//:HorrorFlick.java
//You can insert Cloneability at any level of inheritance
import java.util.*;
class Person{}
class Hero extends Person{}
class Scientist extends Person implements Cloneable{
	public Object clone(){
		try{
			return super.clone();
		}catch(CloneNotSupportedException e){
			//this should never happen:
			//It's Cloneable already
			throw new InternalError();
		}
	}
}
class MadScientist extends Scientist{}
public class HorrorFlick {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Person p = new Person();
		Hero h = new Hero();
		Scientist s = new Scientist();
		MadScientist m = new MadScientist();
		//p = (Person)p.clone();
		//h = (Hero)h.clone();
		s = (Scientist)s.clone();
		m = (MadScientist)m.clone();
	}

}///:~
