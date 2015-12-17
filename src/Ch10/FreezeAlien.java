package Ch10;
//:FreezeAlien.java
//Create a serialized output file
import java.io.*;

public class FreezeAlien {

	public static void main(String[] args) throws Exception{
		// TODO 自动生成的方法存根
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.x"));
		Alien zorcon = new Alien();
		out.writeObject(zorcon);
	}

}///:~
