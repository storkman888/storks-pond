import java.util.Scanner;

/*
 * BMI I/O
 * Nathaniel Smith
 * version 1.0
 * 
 * Honor Code:
 * “I pledge that this program represents my own program code. 
 * I received help from Brandon Perry (I am using his code for a base as I lost my BMI code) in designing and debugging my program.”
 */

public class nathanielSmithBMIIO {
	
	// fields used for calculating BMI
	private double weight;
	private double height;
	private double bmi;
	final double KILOGRAMS_PER_POUND = 0.45359237; //constant
	final double METERS_PER_INCH = 0.0254; //constant
	private double weightInKilograms;
	private double heightInMeters;
	

	//getters and setters
	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWeightInKilograms() {
		return weightInKilograms;
	}


	public void setWeightInKilograms(double weightInKilograms) {
		this.weightInKilograms = weightInKilograms;
	}


	public double getHeightInMeters() {
		return heightInMeters;
	}


	public void setHeightInMeters(double heightInMeters) {
		this.heightInMeters = heightInMeters;
	}


	public double getBmi() {
		return bmi;
	}


	public void setBmi(double bmi) {
		this.bmi = bmi;
	}
	//end getters/setters


	//prompt user for weight and height
	public void promptUser() {
		
		//do loop
		do {
			
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
		
			//Try/catch exception handler
			try {
				
				//Prompt user to enter weight in pounds
				System.out.print("Enter weight in pounds: ");
				setWeight(input.nextDouble());
		
				//Prompt user to enter height in inches
				System.out.print("Enter height in inches: ");
				setHeight(input.nextDouble());
		
		} 
			//If the entered characters are not numbers, tell the user to try again
			catch(Exception e) {
				
				input.reset();
				System.out.println("Please enter a number and try again.");
				continue;
			
		}
			
			break;
		} 
		
		while (true);

	}
	
	//takes user information and calculates BMI
	public void calculateBMI() {
		
		setWeightInKilograms( weight * KILOGRAMS_PER_POUND);
		setHeightInMeters(getHeight() * METERS_PER_INCH);
		setBmi(getWeightInKilograms() / (getHeightInMeters() * getHeightInMeters()));
		
		System.out.println("BMI is " + bmi);
	    if (bmi < 18.5)
	      System.out.println("Underweight");
	    else if (bmi < 25)
	      System.out.println("Normal");
	    else if (bmi < 30)
	      System.out.println("Overweight");
	    else
	      System.out.println("Obese");
	}
	
	//Creates and prints BMI info to a file
	public void printToFile() {
		
		//Creates file
		java.io.File file = new java.io.File("YourBMI.txt");
		
		//If the file already exists, prompt the user the remove the file
		if (file.exists()) {
			System.out.println("File already exists, please delete or move file to create new one.");
			System.exit(1);
		}
		
		//Writes to the file
		System.out.print("Your weight is= ");
		System.out.println("");
		System.out.print("Your height is= ");
		System.out.println("");
		System.out.print("Your BMI is= ");
		System.out.println("");
		System.out.print("You are= ");
		System.out.println("");
		
		//Close file
		System.out.close();
		
	}
	
	
	/* Code not in use
	@Override
	public String toString() {
		return "Your weight is= " + getWeight() + "Your height is=" + getHeight() + "Your BMI is " + getBmi();
	}
	*/

	//main method 
	public static void main(String[] args) {
		
		nathanielSmithBMIIO obj = new nathanielSmithBMIIO();
		obj.promptUser();
		obj.calculateBMI();
		obj.printToFile();
	}

}
