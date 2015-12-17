package Ch13;
//:JButtonDemo.java
//Looks like Java 1.1 but with J's added
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

import javax.swing.*;
public class JButtonDemo extends Applet{
	JButton b1 = new JButton("JButton 1");
	JButton b2 = new JButton("JButton 2");
	JTextField t = new JTextField(20);
	public void init(){
		ActionListener a1 = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				String name = ((JButton)e.getSource()).getText();
				t.setText(name);
			}
			
		};
		b1.addActionListener(a1);
//		b1.setToolTipText("Hello JButton 1");
		add(b1);
		b2.addActionListener(a1);
		add(b2);
		add(t);
	}
	public static void main(String args[]){
		JButtonDemo applet = new JButtonDemo();
		JFrame frame = new JFrame("TextAreaNew");
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		frame.getContentPane().add(applet, BorderLayout.CENTER);
		frame.setSize(300, 100);
		applet.init();
		applet.start();
		frame.setVisible(true);
	}
}
