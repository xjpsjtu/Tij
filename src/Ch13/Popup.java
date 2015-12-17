package Ch13;
//:Popup.java
//Creating popup menus with Swing
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Popup extends JPanel{
	JPopupMenu popup = new JPopupMenu();
	JTextField t = new JTextField(10);
	public Popup(){
		add(t);
		ActionListener a1 = new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t.setText(((JMenuItem)e.getSource()).getText());
			}
		};
		JMenuItem m = new JMenuItem("Hither");
		m.addActionListener(a1);
		popup.add(m);
		m = new JMenuItem("You");
		m.addActionListener(a1);
		popup.add(m);
		m = new JMenuItem("After");
		m.addActionListener(a1);
		popup.add(m);
		popup.addSeparator();
		m = new JMenuItem("Stay Here");
		m.addActionListener(a1);
		popup.add(m);
		PopupListener p1 = new PopupListener();
		addMouseListener(p1);
		t.addMouseListener(p1);
	}
	class PopupListener extends MouseAdapter{
		public void mousePressed(MouseEvent e){
			maybeShowPopup(e);
		}
		public void mouseReleased(MouseEvent e){
			maybeShowPopup(e);
		}
		private void maybeShowPopup(MouseEvent e){
			if(e.isPopupTrigger()){
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Show.inFrame(new Popup(), 200, 150);
	}

}
