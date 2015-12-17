package ch7;
//:Event.java
//The common methods for any control event
abstract public class Event {
	private long evtTime;
	public Event(long eventTime){
		evtTime = eventTime;
	}
	public boolean ready(){
		return System.currentTimeMillis() >= evtTime;
	}
	abstract public void action();
	abstract public String description();
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}///~
