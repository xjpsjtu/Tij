package Ch13;
//:Button2NewB.java
//An application and applet
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Button2NewB extends Applet{
	Button b1 = new Button("Button 1");
	Button b2 = new Button("Button 2");
	TextField t = new TextField(20);
	public void init(){
		b1.addActionListener(new B1());
		b2.addActionListener(new B2());
		add(b1);
		add(b2);
		add(t);
	}
	class B1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			t.setText("Button 1");
		}
		
	}
	class B2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			t.setText("Button 2");
		}
		
	}
	static class WL extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Button2NewB applet = new Button2NewB();
		Frame aFrame = new Frame("Button2NewB");
		aFrame.addWindowListener(new WL());
		aFrame.add(applet, BorderLayout.CENTER);
		aFrame.setSize(300, 200);
		applet.init();
		applet.start();
		aFrame.setVisible(true);
	}

}///:~
