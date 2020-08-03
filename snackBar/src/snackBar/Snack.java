package snackBar;

public class Snack {
	private static int maxId = 0;

	private int id;
	private String name;
	private int quanitity;
	private double cost;
	private int vendingMachineId;

	// constructor
	public Snack(String name, int quanitity, double cost, int vendingMachineId) {
		maxId++;

		id = maxId;

		this.name = name;
		this.quanitity = quanitity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
	}

	// getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quanitity;
	}

	public double getCost() {
		return cost;
	}

	public int getVendingMachineId() {
		return vendingMachineId;
	}

	// setters
	public void setName(String name) {
		this.name = name;
	}

	public void setQuantity(int quanitity) {
		this.quanitity = quanitity;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setBendimMachineId(int vendingMachineId) {
		this.vendingMachineId = vendingMachineId;
	}

	// other methdos

	public void addQuantity(int quanitity) {
		this.quanitity = this.quanitity + quanitity;
	}

	public void removeQunatity(int quanitity) {
		this.quanitity = this.quanitity - quanitity;
	}

	public double totalCost(int quanitity) {
		return quanitity * cost;
	}

	public double totalCost() {
		return quanitity * cost;
	}

	// print statments

	public String basicString() {
		return "Quantity of snack " + name + " is " + quanitity;
	}

	public String toString(String vendingMachineName) {
		return 
		"Snack: " + name + "\n" +
		"Vending Machine: " + vendingMachineName + "\n" +
		"Quantity: " + quanitity + "\n" +
		"Total Cost: $" + String.format("%.2f",totalCost());
	}
}