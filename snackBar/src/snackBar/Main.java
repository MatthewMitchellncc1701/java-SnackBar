package snackBar;

public class Main {

	public static void main(String[] args) {
		mvpWork();
		stretchGoalsWork();
	}
	
	public static void mvpWork() {
		Customer c1 = new Customer("1", 37.75);
		Customer c2 = new Customer("2", 28.14);
		VendingMachine v1 = new VendingMachine("1");

		// String name, int quanitity, double cost, int vendingMachineId

		Snack s4 = new Snack("4", 21, 0.0, v1.getId());
		Snack s3 = new Snack("3", 29, 0.0, v1.getId());
		Snack s2 = new Snack("2", 35, 0.0, v1.getId());

		//block 1
		System.out.println(c1);
		System.out.println(s4.basicString());
		System.out.println();


		//block 2
		c1.subtractCash(2.0);
		System.out.println(c1);
		System.out.println(s3.basicString());
		System.out.println();

		//block 3
		s4.removeQunatity(2);
		System.out.println(c2);
		System.out.println(s4.basicString());
		System.out.println();

		//block 4
		c1.addCash(10.0);
		System.out.println(c1);
		System.out.println();

		//block 5
		c1.subtractCash(1.0);
		System.out.println(c1);
		System.out.println(s2.basicString());
		System.out.println();

		//block 6
		s3.addQuantity(12);
		System.out.println(s3.basicString());
		System.out.println();

		//block 7
		c2.subtractCash(6.0);
		System.out.println(c2);
		s3.removeQunatity(3);
		System.out.println(s3.basicString());
	}

	public static void stretchGoalsWork() {
		System.out.println();
		System.out.println("Streach Goals");
		System.out.println();

		VendingMachine food = new VendingMachine("Food");
		VendingMachine drink = new VendingMachine("drink");

		Snack chips = new Snack("Chips", 36, costPerItem(36, 63.0), food.getId());
		Snack chocolateBar = new Snack("Chocolate Bar", 35, costPerItem(35, 35.0), food.getId());
		Snack pretzel = new Snack("Pretzel", 38, costPerItem(38, 76.0), food.getId());
		Snack soda = new Snack("Soda", 19, costPerItem(19, 47.50), drink.getId());
		Snack water = new Snack("Water", 20, costPerItem(20, 55.0), drink.getId());

		System.out.println(chips.toString(food.getName()));
		System.out.println();

		System.out.println(chocolateBar.toString(food.getName()));
		System.out.println();		

		System.out.println(pretzel.toString(food.getName()));
		System.out.println();

		System.out.println(soda.toString(drink.getName()));
		System.out.println();

		System.out.println(water.toString(drink.getName()));
	}

	private static double costPerItem(int quanitity, double totalCost) {
		return totalCost/(double) quanitity;
	}
}