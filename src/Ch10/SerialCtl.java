package Ch10;
//:SerialCt1.java
//Controlling serialization by adding your own writeObject() and readObject() methods.
import java.io.*;
public class SerialCtl implements Serializable{
	String a;
	transient String b;
	public SerialCtl(String aa, String bb){
		a = "Not Transient: "+aa;
		b = "Transient: "+bb;
	}
	public String toString(){
		return a+"\n"+b;
	}
	public void writeObject(ObjectOutputStream stream) throws IOException{
		stream.defaultWriteObject();
		stream.writeObject(b);
	}
	public void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException{
		stream.defaultReadObject();
		b = (String)stream.readObject();
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SerialCtl sc = new SerialCtl("Test1", "Test2");
		System.out.println("Before: \n"+sc);
		ByteArrayOutputStream buf = new ByteArrayOutputStream();
		try{
			ObjectOutputStream o = new ObjectOutputStream(buf);
			o.writeObject(sc);
			//Now get it back:
			ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buf.toByteArray()));
			SerialCtl sc2 = (SerialCtl)in.readObject();
			System.out.println("After:\n"+sc2);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}///:~
