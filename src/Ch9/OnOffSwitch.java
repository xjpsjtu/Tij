package Ch9;
//:OnOffSwitch.java
//Why use finally?
class Switch{
	boolean state = false;
	boolean read(){return state;}
	void on(){state = true;}
	void off(){state = false;}
}

public class OnOffSwitch {
	static Switch sw = new Switch();
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try{
			sw.on();
			//Code that can throw exceptions...
			//sw.off();
		}catch(NullPointerException e){
			System.out.println("NullPoingerException");
			//sw.off();
		}catch(IllegalArgumentException e){
			System.out.println("IOException");
			//sw.off();
		}finally{
			sw.off();
		}
	}

}///:~
