package ch7;
//:Adventure.java
//Multiple interface

import java.util.*;

interface CanFight{
	void fight();
}
interface CanSwim{
	void swim();
}
interface CanFly{
	void fly();
}
class ActionCharacter{
	public void fight(){};
}
class Hero extends ActionCharacter implements CanFight,CanSwim,CanFly{

	@Override
	public void fly() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void swim() {
		// TODO 自动生成的方法存根
		
	}
	
}
public class Adventure {
	static void t(CanFight x){x.fight();}
	static void u(CanSwim x){x.swim();}
	static void v(CanFly x){x.fly();}
	static void w(ActionCharacter x){x.fight();}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Hero i = new Hero();
		t(i);
		u(i);
		v(i);
		w(i);
	}

}///:~
