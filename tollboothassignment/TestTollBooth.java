package tollboothassignment;

public class TestTollBooth {
	public static void main(String[] args) {
		Tollbooth booth = new AlleghenyTollbooth();

        Truck ford = new HyundaiTruck(5, 12500);
        Truck nissan = new Nissantruck(2, 5000);

        booth.calculateToll(ford);
        booth.calculateToll(nissan);
   

        booth.collectReceipts();
	}
}
