package Ch12;
//:Snake.java
//Tests cloning to see if destination of handles are also cloned.

public class Snake implements Cloneable{
	private Snake next = null;
	private char c;
	//Value of i == number of segments
	Snake(int i, char x){
		c = x;
		if(--i > 0)
			next = new Snake(i, (char)(x+1));
	}
	void increment(){
		c++;
		if(next != null)
			next.increment();
	}
	public String toString(){
		String s = ":"+c;
		if(next != null)
			s += next.toString();
		return s;
	}
	public Object clone(){
		Snake o = null;
		try{
			o = (Snake)super.clone();
		}catch(CloneNotSupportedException e){}
//		o.next = (Snake)o.next.clone();
//		if(o.next != null)
//			o.next = (Snake)o.next.clone();
		return o;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Snake s = new Snake(5, 'a');
		System.out.println("s = "+s);
		Snake s2 = (Snake)s.clone();
		System.out.println("s2 = "+s2);
		s.increment();
		System.out.println("after s.increment, s2 = "+s2);
	}

}
