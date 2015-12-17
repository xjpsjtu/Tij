package Ch15;
//Dgram.java
//A utility class to convert back and forth between Strings and DataGramPackets
import java.net.*;
public class Dgram {
	public static DatagramPacket toDatagram(String s, InetAddress destIA, int destPort){
		//Deprecated in Java 1.1, but it works:
		byte[] buf = new byte[s.length() + 1];
		s.getBytes(0, s.length(), buf, 0);
		//The correct Java 1.1 approach, but it's broken(its truncates the String):
		//byte[] buf = s.getBytes();
		return new DatagramPacket(buf, buf.length, destIA, destPort);
	}
	public static String toString(DatagramPacket p){
		//The java 1.0 approach:
		//return new String(p.getData(), 0, 0, p.getLength());
		//The java 1.1 approach
		return new String(p.getData(), 0, p.getLength());
	}
}
