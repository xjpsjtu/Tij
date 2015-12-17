package Ch10;
//:IoStreamDemo.java
//Typical IO Stream Configurations
import java.io.*;


public class IOStreamDemo {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		try{
			//1.Buffered input file
			DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(args[0])));
			String s,s2 = new String();
			while((s = in.readLine())!=null)
				s2 += s+"\n";
			in.close();
			
			System.out.println("End of 1");
			
			//2.Input from memory
			StringBufferInputStream in2 = new StringBufferInputStream(s2);
			int c;
			while((c = in2.read())!=-1)
				System.out.print((char)c);
			
			System.out.println("End of 2");
			
			//3.Formatted memory input
			try{
				DataInputStream in3 = new DataInputStream(new StringBufferInputStream(s2));
				while(true)
					System.out.print((char)in3.readByte());
			}catch(EOFException e){
				System.out.println("End of stream encountered");
			}
			System.out.println("End of 3");
			
			//4. Line numbering & file output
			try{
				LineNumberInputStream li = new LineNumberInputStream(new StringBufferInputStream(s2));
				DataInputStream in4 = new DataInputStream(li);
				PrintStream out1 = new PrintStream(new BufferedOutputStream(new FileOutputStream("IODemo2.txt")));
				while((s=in4.readLine())!=null)
					out1.println("Line "+li.getLineNumber()+s);
				out1.close();//finalize() not reliable!
			}catch(EOFException e){
				System.out.println("End of stream encountered");
			}
			System.out.println("End of 4");
			
			//5.Storing & recovering data
			try{
				DataOutputStream out2 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Data.txt")));
				out2.writeBytes("Here's the value of pi: \n");
				out2.writeDouble(3.14159);
				out2.close();
				DataInputStream in5 = new DataInputStream(new BufferedInputStream(new FileInputStream("Data.txt")));
				System.out.println(in5.readLine());
				System.out.println(in5.readDouble());
			}catch(EOFException e){
				System.out.println("End of stream encountered");
			}
			System.out.println("End of 5");
			//6.Reading/writing random access files
			RandomAccessFile rf = new RandomAccessFile("rtest.dat","rw");
			for(int i = 0;i< 10; i++)
				rf.writeDouble(i*1.414);
			rf.close();
			
			rf=new RandomAccessFile("rtest.dat","rw");
			rf.seek(5*8);
			rf.writeDouble(47.0001);
			rf.close();
			
			rf=new RandomAccessFile("rtest.dat","r");
			for(int i = 0; i < 10; i++)
				System.out.println("Value "+i+": "+rf.readDouble());
			rf.close();
			
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
