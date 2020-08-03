package snackBar;

public class Customer {

	private static int maxId = 0;

	private int id;
	private String name;
	private double cash;

	// constructor
	public Customer(String name, double cash) {
		maxId++;

		id = maxId;
		this.name = name;
		this.cash = cash;
	}

	// getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCash() {
		return cash;
	}

	// setters
	public void setName(String name) {
		this.name = name;
	}

	// other funcstions

	public void addCash(double cash) {
		this.cash = this.cash + cash;
	}

	public void subtractCash(double cash) {
		this.cash = this.cash - cash;
	}

	@Override
	public String toString() {
		return "Customer " + name + " cash on hand " + cash;
	}
}