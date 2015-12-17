package Ch10;
//:DirList.java
//Displays directory listing
import java.io.*;

public class DirList {
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try{
			File path = new File(".");
		String[] list;
		if(args.length == 0)
			list = path.list();
		else
			list = path.list(new DirFilter(args[0]));
		for(int i = 0; i < list.length; i++)
			System.out.println(list[i]);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
class DirFilter implements FilenameFilter{
	String afn;
	DirFilter(String afn){
		this.afn = afn;
	}
	public boolean accept(File dir, String name){
		//Strip path information:
		String f = new File(name).getName();
		return f.indexOf(afn) != -1;
	}
}///:~