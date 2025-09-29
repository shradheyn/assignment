package tollboothassignment;

public class Nissantruck implements Truck {
	private int axles;
	private int totweight;
	public Nissantruck(int axles, int totweight) {
		this.axles = axles;
		this.totweight = totweight;
	}
	@Override
	public int getAxles() {
		// TODO Auto-generated method stub
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
		return "nissan";
	}
	
	
}
