package Ch10;
//:ThawAlien.java
//Try to recover a serialized file without the class of object that's stored in that file.
import java.io.*;
public class ThawAlien {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.x"));
		Object mystery = in.readObject();
		System.out.println(mystery.getClass().toString());
	}

}
