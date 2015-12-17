package ch14;
//:Counter2i.java
//Counter2 using an inner class for the thread
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Counter2i extends Applet{
	private class SeparateSubTask extends Thread{
		int count = 0;
		boolean runFlag = true;
		SeparateSubTask(){start();}
		public void run(){
			while(true){
				try{
					sleep(100);
				}catch(InterruptedException e){}
				if(runFlag)
					t.setText(Integer.toString(count++));
			}
		}
	}
	private SeparateSubTask sp = null;
	private TextField t = new TextField(10);
	private Button
		onOff = new Button("Toggle"),
		start = new Button("Start");
	public void init(){
		add(t);
		start.addActionListener(new StartL());
		add(start);
		onOff.addActionListener(new OnOffL());
		add(onOff);
	}
	class StartL implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(sp == null)
				sp = new SeparateSubTask();
		}
	}
	class OnOffL implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(sp != null)
				sp.runFlag = !sp.runFlag;
		}
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Counter2i applet = new Counter2i();
		Frame aFrame = new Frame("Counter2");
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
