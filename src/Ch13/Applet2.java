package Ch13;
//:Applet2.java
//Easy graphics
import java.awt.*;
import java.applet.*;
public class Applet2 extends Applet{
	public void paint(Graphics g){
		g.drawString("Second applet", 10, 15);
		g.draw3DRect(0, 0, 100, 120, true);
	}
}
