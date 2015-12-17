package ch6;
//:Chess.java
//Inheritance,constructors and arguments

public class Chess extends BoardGame{
	Chess(){
		super(11);
		System.out.println("Chess constructor");
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Chess x = new Chess();
	}

}///~

class Game{
	Game(int i){
		System.out.println("Game constructor");
	}
}

class BoardGame extends Game{
	BoardGame(int i){
		super(i);
		System.out.println("BoardGame constructor");
	}
}