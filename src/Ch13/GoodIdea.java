package Ch13;
//:GoodIdea.java
//The best way to design classes using the new Java 1.1 event model: use an inner class for each different event. This
//maximizes flexibility and modularity
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class GoodIdea extends Frame{
	Button b1 = new Button("Button 1");
	Button b2 = new Button("Button 2");
	public GoodIdea(){
		setLayout(new FlowLayout());
		b1.addActionListener(new B1L());
		b2.addActionListener(new B2L());
		add(b1);
		add(b2);
	}
	class B1L implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			System.out.println("Button 1 pressed");
		}
		
	}
	class B2L implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			System.out.println("Button 2 pressed");
		}
		
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Frame f = new GoodIdea();
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
