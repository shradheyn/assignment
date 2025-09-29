package tollboothassignment;

public class HyundaiTruck implements Truck {
	private int axles;
	private int totweight;
	public HyundaiTruck(int axles, int totweight) {
		this.axles = axles;
		this.totweight = totweight;
	}
	@Override
	public int getAxles() {
		return axles;
	}
	@Override
	public int getTotalWeight() {
		// TODO Auto-generated method stub
		return totweight;
	}
	@Override
	public String getMake() {
		// TODO Auto-generated method stub
		return "hyundai";
	}
	
	
}
