package Ch10;
//:Echo.java
//How to read from standard input
import java.io.*;

public class Echo {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		DataInputStream in = new DataInputStream(System.in);
		String s;
		try{
			while((s = in.readLine()).length()!=0)
				System.out.println(s);
			//An empty line terminates the program
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
