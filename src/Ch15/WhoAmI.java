package Ch15;
//:WhoAmI.java
//Finds out your network address when you're connected to the Internet
import java.net.*;
public class WhoAmI{
	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		if(args.length != 1){
			System.err.println("Usage: WhoAmI machineme");
			System.exit(1);
		}
		InetAddress a = InetAddress.getByName(args[0]);
		System.out.println(a);
	}

}
