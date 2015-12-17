package Ch15;
//:ChatterClient.java
//Tests the ChatterServer by starting multiclients, each of which send datagrams
import java.net.*;
import java.io.*;
public class ChatterClient extends Thread{
	//Can listen & send on the same socket:
	private DatagramSocket s;
	private InetAddress hostAddress;
	private byte[] buf = new byte[1000];
	private DatagramPacket dp = new DatagramPacket(buf, buf.length);
	private int id;
	
	public ChatterClient(int identifier){
		id = identifier;
		try{
			//Auto-assign port number:
			s = new DatagramSocket();
			hostAddress = InetAddress.getByName("localhost");
		}catch(UnknownHostException e){
			System.out.println("Cannot find host");
			System.exit(1);
		}catch(SocketException e){
			System.err.println("Can't open sokcet");
			e.printStackTrace();
			System.exit(1);
		}
		System.out.println("ChatterClient starting");
	}
	public void run(){
		try{
			for(int i = 0; i < 25; i++){
				String outMessage = "Client #" + id + ", message #" + i;
				//Make and send a datagram:
				s.send(Dgram.toDatagram(outMessage, hostAddress, ChatterServer.INPORT));
				//Block until it echoes back:
				s.receive(dp);
				//Print out the echoed contents:
				String rcvd = "Client #" + id + ", rcvd from " + dp.getAddress() + ", " + dp.getPort() + ": " + Dgram.toString(dp);
				System.out.println(rcvd);
			}
		}catch(IOException e){
			e.printStackTrace();
			System.exit(1);
		}
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		for(int i = 0; i < 10; i++)
			new ChatterClient(i).start();
	}

}
