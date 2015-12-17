package Ch9;
//:StormInning.java
//Overridden methods may throw only the exceptions specified in 
//their base-class versions, or exceptions derived from the base-class exceptions.

class BaseballException extends Exception{}
class Foul extends BaseballException{}
class Strike extends BaseballException{}

abstract class Inning{
	Inning() throws BaseballException{}
	void event() throws BaseballException{
		//Doesn't actually have to throw anything
	}
	 abstract void atBat() throws Strike, Foul;
	void walk(){} //Throws nothing
}

class StormException extends Exception{}
class RaineOut extends StormException{}
class PopFoul extends Foul{}

interface Storm{
	void event() throws RaineOut;
	void rainHard() throws RaineOut;
}
public class StormyInning extends Inning implements Storm{
	//OK to add new exceptions for constructors, but you must deal
	//with the base constructor exceptions:
	StormyInning() throws RaineOut, BaseballException{}
	StormyInning(String s) throws Foul, BaseballException{}
	//Regular methods must conform to base class:
	//! void walk() throws PopFoul{}
	//Compile error Interface CANNOT add exceptions to existing methods from the base c
	//class:
	//! public void event() throws RaineOut{}
	//If the method doesn't already exist in the base class, the exception is OK: 
	public void rainHard() throws RaineOut{}
	//You can choose to not throw any exceptions, even if base version does:
	public void event(){}
	//Overridden methods can throw inherited exceptions:
	void atBat() throws PopFoul{}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try{
			StormyInning si = new StormyInning();
			si.atBat();
		}catch(PopFoul e){
		}catch(RaineOut e){
		}catch(BaseballException e){}
		//Strike not thrown in derived version.
		try{
			//What happens if you upcast?
			Inning i = new StormyInning();
			i.atBat();
			//You must catch the exceptions from the base-class version of the method:
		}catch(Strike e){
		}catch(Foul e){
		}catch(RaineOut e){
		}catch(BaseballException e){}
	}

}///:~
















