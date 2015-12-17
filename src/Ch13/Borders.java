package Ch13;
//:Borders.java
//Different Swing borders
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Borders extends JPanel{
	static JPanel showBorder(Border b){
		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout());
		String nm = b.getClass().toString();
		nm = nm.substring(nm.lastIndexOf('.')+1);
		jp.add(new JLabel(nm, JLabel.CENTER), BorderLayout.CENTER);
		jp.setBorder(b);
		return jp;
	}
	public Borders(){
		setLayout(new GridLayout(2,4));
		add(showBorder(new TitledBorder("Title")));
		add(showBorder(new EtchedBorder()));
		add(showBorder(new LineBorder(Color.blue)));
		add(showBorder(new MatteBorder(5,5,30,30,Color.GREEN)));
		add(showBorder(new BevelBorder(BevelBorder.RAISED)));
		add(showBorder(new CompoundBorder(new EtchedBorder(), new LineBorder(Color.RED))));
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Show.inFrame(new Borders(), 500, 300);
	}

}
