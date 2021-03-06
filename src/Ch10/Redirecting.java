package Ch10;
//:Redirecting.java
//Demonstrates the use of redirection for standard IO in java 1.1
import java.io.*;

public class Redirecting {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try{
			BufferedInputStream in = new BufferedInputStream(new FileInputStream("Redirecting.java"));
			//Produces deprecation message:
			PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("test.out")));
			System.setIn(in);
			System.setOut(out);
			System.setErr(out);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s;
			while((s = br.readLine())!=null)
				System.out.println(s);
			out.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
