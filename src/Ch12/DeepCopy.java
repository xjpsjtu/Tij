package Ch12;
//:DeepCopy.java
//Cloning a composed object

class DepthReading implements Cloneable{
	private double depth;
	public DepthReading(double depth){
		this.depth = depth;
	}
	public Object clone(){
		Object o = null;
		try{
			o = super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return o;
	}
}
class TemperatureReading implements Cloneable{
	private long time;
	private double temperature;
	public TemperatureReading(double temperature){
		time = System.currentTimeMillis();
		this.temperature = temperature;
	}
	public Object clone(){
		Object o = null;
		try{
			o = super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return o;
	}
}
class OceanReading implements Cloneable{
	private DepthReading depth;
	private TemperatureReading temperature;
	public OceanReading(double tdata, double ddata){
		temperature = new TemperatureReading(tdata);
		depth = new DepthReading(ddata);
	}
	public Object clone(){
		OceanReading o = null;
		try{
			o = (OceanReading)super.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		o.depth = (DepthReading)o.depth.clone();
		o.temperature = (TemperatureReading)o.temperature.clone();
		return o; //Upcasts back to object;=
	}
}
public class DeepCopy {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		OceanReading reading = new OceanReading(33.9, 100.5);
		OceanReading r = (OceanReading)reading.clone();
	}

}
