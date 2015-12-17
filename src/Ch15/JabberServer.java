package Ch15;
//:JabberServer.java
//Very simple server that just echoes whatever the client sends
import java.io.*;
import java.net.*;

public class JabberServer {
	//Choose a port outside of the range 1-1024:
	public static final int PORT = 10000;
	public static void main(String[] args) throws IOException{
		// TODO 自动生成的方法存根
		ServerSocket s = new ServerSocket(PORT);
		System.out.println("Started: " + s);
		try{
			//Blocks until a connection occurs:
			Socket socket = s.accept();
			try{
				System.out.println("Connection accepted: " + socket);
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				//Output is automatically flushed by PrintWriter:
				PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
				while(true){
					String str = in.readLine();
//					if(str.equals("END"))break;
					System.out.println(str);
					//out.println(str);
				}
				//Always close the two sockets...
			}finally{
				System.out.println("serverClosing...");
				socket.close();
			}
		}finally{
			s.close();
		}
	}

}
