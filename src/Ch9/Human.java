package Ch9;
//:Human.java
//Catching Exception Hierarchies

class Annoyance extends Exception{}
class Sneeze extends Annoyance{}

public class Human {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		try {
			throw new Sneeze();
		} catch (Sneeze e) {
			System.out.println("Caught Sneeze");
		}catch(Annoyance a){
			System.out.println("Caught Annoyance");
		}
	}

}///:~
