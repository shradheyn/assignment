package tollboothassignment;

public class AlleghenyTollbooth implements Tollbooth{
	private int tottrucks;
	private int totreceipt;
	@Override
	public void calculateToll(Truck truck) {
		int toll;
		toll = (truck.getAxles() * 5) + ((truck.getTotalWeight() / 500) * 10);
		System.out.println("Arrival of " + truck.getMake() + " Truck");
		System.out.println("Truck arrival - Axles: " + truck.getAxles() +
				" Total weight: " + truck.getTotalWeight() +
				" Toll due: $" + toll);

		tottrucks++;
		totreceipt += toll;

	}
	 @Override
	    public void displayData() {
	        System.out.println("*** Collecting receipts  ***");
	        System.out.println("Totals since the last collection - Receipts: $" + totreceipt +
	                " Trucks: " + tottrucks);
	    }
	@Override
    public void collectReceipts() {
        displayData();
        System.out.println("***** Reset Receipts **********");
        totreceipt = 0;
        tottrucks = 0;
        System.out.println("Totals since the last collection - Receipts: $" + totreceipt +
                " Trucks: " + tottrucks);
    }

}
