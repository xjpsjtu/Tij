package Ch13;
//:GoodTechnique.java
//Your first choice when overriding components should be to install listeners. The code is much safer, more modular and maintainable.
import java.awt.*;
import java.awt.event.*;
class Display{
	public static final int EVENT = 0, COMPONENT = 1, MOUSE = 2, MOUSE_MOVE = 3, FOCUS = 4, KEY = 5, ACTION = 6, LAST = 7;
	public String[] evnt;
	Display(){
		evnt = new String[LAST];
		for(int i = 0; i < LAST; i++)
			evnt[i] = new String();
	}
	public void show(Graphics g){
		for(int i = 0; i < LAST; i++)
			g.drawString(evnt[i], 0, 10*i+10);
	}
}
class EnabledPanel extends Panel{
	Color c;
	int id;
	Display display = new Display();
	public EnabledPanel(int i, Color mc){
		id = i;
		c = mc;
		setLayout(new BorderLayout());
		add(new MyButton(), BorderLayout.SOUTH);
		addComponentListener(new CL());
		addFocusListener(new FL());
		addKeyListener(new KL());
		addMouseListener(new ML());
		addMouseMotionListener(new MML());
	}
	//To eliminate flicker:
	public void update(Graphics g){
		paint(g);
	}
	public void paint(Graphics g){
		g.setColor(c);
		Dimension s = getSize();
		g.fillRect(0, 0, s.width, s.height);
		g.setColor(Color.BLACK);
		display.show(g);
	}
	//Don't need to enable anything for this:
	public void processEvent(AWTEvent e){
		display.evnt[Display.EVENT]=e.toString();
		repaint();
		super.processEvent(e);
	}
	class CL implements ComponentListener{

		@Override
		public void componentResized(ComponentEvent e) {
			// TODO 自动生成的方法存根
			display.evnt[Display.COMPONENT] = "Component resized";
			repaint();
		}

		@Override
		public void componentMoved(ComponentEvent e) {
			// TODO 自动生成的方法存根
			display.evnt[Display.COMPONENT] = "Component moved";
			repaint();
		}

		@Override
		public void componentShown(ComponentEvent e) {
			// TODO 自动生成的方法存根
			display.evnt[Display.COMPONENT] = "Component shown";
			repaint();
		}

		@Override
		public void componentHidden(ComponentEvent e) {
			// TODO 自动生成的方法存根
			display.evnt[Display.COMPONENT] = "Component hidden";
			repaint();
		}
		
	}
	class FL implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			// TODO 自动生成的方法存根
			display.evnt[Display.FOCUS]="FOCUS gained";
			repaint();
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO 自动生成的方法存根
			display.evnt[Display.FOCUS]="FOCUS lost";
			repaint();
		}
		
	}
	class KL implements KeyListener{

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO 自动生成的方法存根
			display.evnt[Display.KEY]="KEY typed";
			showCode(e);
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO 自动生成的方法存根
			display.evnt[Display.KEY]="KEY pressed";
			showCode(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO 自动生成的方法存根
			display.evnt[Display.KEY]="KEY released";
			showCode(e);
		}
		void showCode(KeyEvent e){
			int code = e.getKeyCode();
			display.evnt[Display.KEY] += KeyEvent.getKeyText(code);
			repaint();
		}
	}
	class ML implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO 自动生成的方法存根
			requestFocus(); //Get Focus on click
			display.evnt[Display.MOUSE] = "MOUSE clicked";
			showMouse(e);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO 自动生成的方法存根
			display.evnt[Display.MOUSE] = "MOUSE pressed";
			showMouse(e);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO 自动生成的方法存根
			display.evnt[Display.MOUSE] = "Mouse released";
			showMouse(e);
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO 自动生成的方法存根
			display.evnt[Display.MOUSE] = "Mouse entered";
			showMouse(e);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO 自动生成的方法存根
			display.evnt[Display.MOUSE] = "Mouse exited";
			showMouse(e);
		}
		void showMouse(MouseEvent e){
			display.evnt[Display.MOUSE] += ", x = "+e.getX()+", y = "+e.getY();
			repaint();
		}
	}
	class MML implements MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO 自动生成的方法存根
			display.evnt[Display.MOUSE_MOVE] = "Mouse dragged";
			showMouse(e);
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO 自动生成的方法存根
			display.evnt[Display.MOUSE_MOVE] = "Mouse moved";
			showMouse(e);
		}
		void showMouse(MouseEvent e){
			display.evnt[Display.MOUSE_MOVE] += ", x = "+e.getX()+", y = "+e.getY();
			repaint();
		}
	}
}
class MyButton extends Button{
	int clickCounter;
	String label = "";
	public MyButton(){
		addActionListener(new AL());
	}
	public void paint(Graphics g){
		g.setColor(Color.GREEN);
		Dimension s = getSize();
		g.fillRect(0, 0, s.width, s.height);
		g.drawRect(0, 0, s.width-1, s.height-1);
		drawLabel(g);
	}
	private void drawLabel(Graphics g){
		FontMetrics fm = g.getFontMetrics();
		int width = fm.stringWidth(label);
		int height = fm.getHeight();
		int ascent = fm.getAscent();
		int leading = fm.getLeading();
		int horizMargin = (getSize().width-width)/2;
		int verMargin = (getSize().height-height)/2;
		g.setColor(Color.RED);
		g.drawString(label, horizMargin, verMargin+ascent+leading);
	}
	class AL implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO 自动生成的方法存根
			clickCounter++;
			label = "click # "+clickCounter+" "+e.toString();
			repaint();
		}
		
	}
}

public class GoodTechnique extends Frame{
	GoodTechnique(){
		setLayout(new GridLayout(2,2));
		add(new EnabledPanel(1, Color.CYAN));
		add(new EnabledPanel(2, Color.LIGHT_GRAY));
		add(new EnabledPanel(3, Color.YELLOW));
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Frame f = new GoodTechnique();
		f.setTitle("Good Technique");
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.out.println(e);
				System.out.println("Window Closing");
				System.exit(0);
			}
		});
		f.setSize(700, 700);
		f.setVisible(true);
	}

}
