package ch6;
//:beetle.java
//The full process of initialization

class Insect{
	int i = 9;
	int j;
	Insect(){
		System.out.println("super construction");
		prt("i= "+i+", j = "+j);
	}
	static int x1 = prt("static Insect.x1 initialized");
	static int prt(String s){
		System.out.println(s);
		return 47;
	}
}
public class Beetle extends Insect{
	int k = prt("Beetle.k initialized");
	Beetle(){
		System.out.println("base construction");
		prt("k = "+k);
		prt("j = "+j);
	}
	static int x2 = prt("static Beetle x2 initialized");
	static int prt(String s){
		System.out.println(s);
		return 63;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		prt("beetle constructor");
		Beetle b =  new Beetle();
	}

}///~
