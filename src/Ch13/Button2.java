package Ch13;
//:Button2.java
//Capturing button presses
import java.awt.*;
import java.applet.*;
public class Button2 extends Applet{
	Button b1 = new Button("Button 1");
	Button b2 = new Button("Button 2");
	public void init(){
		add(b1);
		add(b2);
	}
	public boolean action(Event evt, Object arg){
		if(evt.target.equals(b1))
			getAppletContext().showStatus("Button 1");
		else if(evt.target.equals(b2))
			getAppletContext().showStatus("Button 2");
		else
			return super.action(evt, arg);
		return true;
	}
}///:~
