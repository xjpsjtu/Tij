package ch6;
//:BlankFinal.java
//"Blank" final data members

class Poppet{}

public class BlankFinal {
	final int i = 0;//Initialized final
	final int j;//Blank final
	final Poppet p;//Blank final
	
	BlankFinal(){
		j = 1;
		p = new Poppet();
	}
	
	BlankFinal(int x){
		j = x;
		p = new Poppet();
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		BlankFinal bf = new BlankFinal();
	}

}///~
