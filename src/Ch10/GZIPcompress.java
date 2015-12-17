package Ch10;
//:GZIPcompres.java
//Uses Java 1.1 GZIP compression to compress a file whose name is passed on the command line
import java.io.*;
import java.util.zip.*;

public class GZIPcompress {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try{
			BufferedReader in = new BufferedReader(new FileReader(args[0]));
			BufferedOutputStream out = new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream("test.gz")));
			System.out.println("Writing file");
			int c;
			while((c = in.read())!=-1)
				out.write(c);
			in.close();
			out.close();
			System.out.println("Reading file");
			BufferedReader in2 = new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream("test.gz"))));
			//PrintWriter out2 = new PrintWriter(new BufferedWriter(new FileWriter("testgz.txt")));
			DataOutputStream out2 = new DataOutputStream(new FileOutputStream("testgz.txt"));
			String s;
			while((s = in2.readLine())!= null){
				System.out.println(s);
				out2.writeBytes(s+'\n');
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}///:~
