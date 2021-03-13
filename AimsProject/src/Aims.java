
public class Aims {
	public static void main(String[] args) {
		// Create a new order
		Order anOrder = new Order();
		
		// Create new DVD objects and add to the order
		DigitalVIdeoDisc dvd1 = new DigitalVIdeoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        
        DigitalVIdeoDisc dvd2 = new DigitalVIdeoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        
        DigitalVIdeoDisc dvd3 = new DigitalVIdeoDisc("Aladin", "Animation", "Roger Allers", 19.95f);
        anOrder.addDigitalVideoDisc(dvd3);
        
        // print total cost of the order
        System.out.println("Total cost is: ");
        System.out.println(anOrder.totalCost());
        
	}
}
