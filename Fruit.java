package Ex4_2;

import java.util.Scanner;

//Parent class Fruit
class Fruit {
	//only accessible in the class Fruit but can be accessed in other class by accessor
	private String name;
	Scanner s = new Scanner(System.in);
	
	//parameterized constructor
	public Fruit(String name) {
			this.name = name;
			System.out.println("Fruit constructor is invoked");
			System.out.println("\n+++++++++++++  "+ name.toUpperCase() +"  ++++++++++++++");
			juiceRecipe();
	}
	
	//overriding toString method
	public String toString() {
		return ("Fresh and healthy fruits");
	}
	
	//overriding method
	public void juiceRecipe() {
		System.out.println("Fruits can be used to make juice.\nRecipes are provided for each fruits");
	}
	
	//accessor
	public String getName() {
		return this.name;
	}
}