package Ch13;
//ChoiceNew.java
//Drop-down lists  with Java 1.1
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class ChoiceNew extends Applet{
	String[] description = { "Ebullient", "Obtuse", "Recalcitrant",
			"Brilliant", "Somnescent", "Timorous", "Florid", "Putrescent"
	};
	TextField t = new TextField(100);
	Choice c = new Choice();
	Button b = new Button("Add items");
	int count = 0;
	public void init(){
		t.setEditable(false);
		for(int i = 0; i < 4; i++)
			c.addItem(description[count++]);
		add(t);
		add(c);
		add(b);
		c.addItemListener(new CL());
		b.addActionListener(new BL());
	}
	class CL implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO 自动生成的方法存根
			t.setText("index: "+ c.getSelectedItem()+" "+e.toString());
		}
		
	}
	class BL implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			if(count < description.length)
				c.addItem(description[count++]);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ChoiceNew applet = new ChoiceNew();
		Frame aFrame = new Frame("ChoiceNew");
		aFrame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		aFrame.add(applet, BorderLayout.CENTER);
		aFrame.setSize(750, 100);
		applet.init();
		applet.start();
		aFrame.setVisible(true);
	}

}
