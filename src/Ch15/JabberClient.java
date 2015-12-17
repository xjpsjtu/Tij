package Ch15;
//:JabberClient.java
//Very simple client that just sends lines to the server and reads lines that the server sends.
import java.net.*;
import java.io.*;
public class JabberClient {
	public static void main(String[] args) throws IOException{
		// TODO 自动生成的方法存根
		//Passing null to getByName() produces the special "Local Loopback" IP address,
		//for testing on the machine w/o a network:
//		String ip_str = "183.195.251.203";
//		String[] ipStr = ip_str.split("\\.");
//		byte[] ipBuf = new byte[4];
//		for(int i = 0; i < 4; i++){
//			ipBuf[i] = (byte)(Integer.parseInt(ipStr[i])&0xff);
//		}
//		InetAddress addr = InetAddress.getByAddress(ipBuf);
//		//Alternatively, you can use the address or name:
//		System.out.println("addr = " + addr);
		Socket socket = new Socket("10.255.38.35", 8000);
		//Guard everything in a try-finally to make sure that the socket is closed:
		try{
			System.out.println("socket = " + socket);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//Output is automatically flushed by PrintWriter:
			PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
			for(int i = 0; i < 10; i++){
				out.println("howdy " + i);
				String str = in.readLine();
				System.out.println(str);
			}
			out.println("END");
		}finally{
			System.out.println("clientClosing...");
			socket.close();
		}
	}

}
