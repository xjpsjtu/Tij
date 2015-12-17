package Ch13;
//:ListNew.java
//Java 1.1 Lists are easier to use
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class ListNew extends Applet{
	String[] flavors = {
			"Chocolate", "Strawberry", "Vanilla Fudge Swirl", "Mint Chip", "Mocha Almond Fudge",
			"Rum Raisin", "Praline Cream", "Mud Pie"
	};
	//Show 6 items, allow multiple selection:
	List lst = new List(6, true);
	TextArea t = new TextArea(flavors.length, 30);
	Button b = new Button("test");
	int count = 0;
	public void init(){
		t.setEditable(false);
		for(int i = 0; i < 4; i++)
			lst.addItem(flavors[count++]);
		add(t);
		add(lst);
		add(b);
		lst.addItemListener(new LL());
		b.addActionListener(new BL());
	}
	class LL implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO 自动生成的方法存根
			t.setText(" ");
			String[] items = lst.getSelectedItems();
			for(int i = 0; i < items.length; i++)
				t.append(items[i]+"\n");
		}
		
	}
	class BL implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			if(count < flavors.length){
				lst.addItem(flavors[count++], 0);
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ListNew applet = new ListNew();
		Frame aFrame = new Frame();
		aFrame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		aFrame.add(applet, BorderLayout.CENTER);
		aFrame.setSize(300, 200);
		applet.init();
		applet.start();
		aFrame.setVisible(true);
	}

}
