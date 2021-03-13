import java.util.Arrays;

public class Order {
	public static final int MAX_NUMBERS_OF_ORDERED = 10;
	private DigitalVIdeoDisc itemOrdered[] = new DigitalVIdeoDisc [MAX_NUMBERS_OF_ORDERED];
	private int length = 0;
	// method
	public int qtyOrdered() {
		return length;
	}
	
	public void addDigitalVideoDisc(DigitalVIdeoDisc disc) {
		if (length > 10) {
			System.out.println("The order is almost full");
		}else {
			itemOrdered = insert(itemOrdered, disc);
			length++;
			System.out.println("The disc has been added.");
		}
	}
	
	public DigitalVIdeoDisc[] insert(DigitalVIdeoDisc[] itemOrdered, DigitalVIdeoDisc disc) {
		itemOrdered = Arrays.copyOf(itemOrdered, length + 1);
		itemOrdered[length - 1] = disc;
		return itemOrdered;
	}
	
	public void removeDigitalVideoDisc(DigitalVIdeoDisc disc) {
		int flag = 0;
		for(int i = 0; i<length; ++i) {
			if (itemOrdered[i] == disc) {
				itemOrdered = Arrays.copyOf(itemOrdered, length -1);
				for(int j = i; j< length; ++j) {
					itemOrdered[j] = itemOrdered[i+1];
				}
				length--;
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("Not exists this disc");
		}
	}
	
	public float totalCost() {
		float allCost = 0;
		for (int i=0; i<length; ++i) {
			allCost += itemOrdered[i].getCost();
		}
		return allCost;
	}
}
