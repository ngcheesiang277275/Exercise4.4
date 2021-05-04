package Ex4_2;

class Watermelon extends Fruit {
	private String colour;
	private int stock;
	private double weight;
	private int serving;
	private double weightNeeded;
	private double pricePerKg;
	
	//parameterized constructor
	public Watermelon(String name, String colour, int stock) {
		super(name);
		this.colour = colour;
		this.stock = stock;
		System.out.println("Watermelon constructor is invoked");
		
		purchase();
	}
	
	//method
	public void purchase() {
		System.out.println("\n-----------------Purchase------------------");

		System.out.printf("%-20s: ", "Enter Weight(kg)");
		weight = s.nextDouble();
		
		if(weight >0 ) {
			if(weight < 2) {
				pricePerKg = 5.0;
				calculatePrice();
				System.out.printf("%-20s: RM%.2f%n", ">>>Total price", calculatePrice());
			
			}else if((weight >= 2)&&(weight <= 4)) {
				double pr = 4.5;
				calculatePrice(pr);
				System.out.printf("%-20s: RM%.2f%n", ">>>Total price", calculatePrice(pr));			
			}else {
				double pr = 4.0;
				double w = this.weight;
				calculatePrice(pr, w);
				System.out.printf("%-20s: RM%.2f%n", ">>>Total price", calculatePrice(pr,w));			
			}
		
		}
	}
	
	
	//overriding toString method
	public String toString() {
		return ("Fruit\t\t: " + getName() + "\nColour\t\t: " + colour + "\nStock\t\t: " + stock + "\n");
	}
	
	//overriding method
	public void juiceRecipe() {
		System.out.println("-------Watermelon Juice Calculator-------");
		System.out.print("Enter number of servings: ");
		this.serving = s.nextInt();
		
		this.weightNeeded = this.serving * 0.5; 
		System.out.println("Ingredients needed: \n1. " + this.weightNeeded + "kg of watermelon\n2. Lime\n");
		System.out.println("----------Recipe----------");
		System.out.println("1. Slice the watermelon.\n2. Scoop and blend the watermelon.\n3. Squeeze some small limes for extra flavour.\n");

	}
	
	//overloading method - no argument
	public double calculatePrice() {
		return this.pricePerKg * this.weight;
	}
	
	//overloading method - 1 argument
	public double calculatePrice(double pr) {
		return pr * this.weight;
	}
	
	//overloading method - 2 argument
	public double calculatePrice(double pr, double w) {
		return pr * w;
	}
	
	//accessor
	public int getServing() {
		return this.serving;
	}
	
	public double getWeight() {
		return this.weight;
	}

}