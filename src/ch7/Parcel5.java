package ch7;
//:Parcel5.java
//Nesting a class within a scope

public class Parcel5 {
	private void internalTracking(boolean b){
		if(b){
			class TrackingSlip{
				private String id;
				TrackingSlip(String s){
					id = s;
				}
				String getSlip(){
					return id;
				}
			}
			TrackingSlip ts = new TrackingSlip("slip");
			String s = ts.getSlip();
		}
		//TrackingSlip ts = new TrackingSlip("x");
	}
	public void track(){
		internalTracking(true);
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Parcel5 p = new Parcel5();
		p.track();
	}

}
