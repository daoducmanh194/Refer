
public class DigitalVIdeoDisc {
	private String title;
	private String category;
	private String derector;
	private int length;
	private float cost;
	
	// Constructor for title
	public DigitalVIdeoDisc(String title) {
		super();
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	public DigitalVIdeoDisc(String title, String category, String derector, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.derector = derector;
		this.length = length;
		this.cost = cost;
	}

	public DigitalVIdeoDisc(String title, String category, String derector, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.derector = derector;
		this.cost = cost;
	}

	public DigitalVIdeoDisc(String category, float cost) {
		super();
		this.category = category;
		this.cost = cost;
	}

	public String getCategory() {
		return category;
	}
	public String getDerector() {
		return derector;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
}
