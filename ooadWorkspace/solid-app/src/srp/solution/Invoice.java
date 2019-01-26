package srp.solution;

public class Invoice {
	private int id;
	private String name;
	private double cost;
	private float discount;
	private float gst;

	public Invoice(int id, String name, double cost, float discount, float gst) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discount = discount;
		this.gst = gst;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public float getDiscount() {
		return discount;
	}

	public float getGst() {
		return gst;
	}

	public double calculateTax() {
		return gst * cost / 100;
	}

	public double calculateDiscount() {
		return discount * cost / 100;
	}

	public double calculateTotalCost() {
		return cost + calculateTax() - calculateDiscount();

	}
}