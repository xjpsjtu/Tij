package Ch13;
//:Button2New.java
//Capturing button presses
import java.awt.*;
import java.awt.event.*;	//Must add this
import java.applet.*;
public class Button2New extends Applet {
	Button b1 = new Button("Button 1");
	Button b2 = new Button("Button 2");
	public void init(){
		b1.addActionListener(new B1());
		b2.addActionListener(new B2());
		add(b1);
		add(b2);
	}
	
	class B1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			getAppletContext().showStatus("Button 1");
		}
		
	}
	class B2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			getAppletContext().showStatus("Button 2");
		}
		
	}
	
}

