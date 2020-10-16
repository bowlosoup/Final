package finalProject;

import java.util.Scanner;

public class tripTester {
	public static void main(String args[])
	{
		tripCalculator calculate = new tripCalculator();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("fuel cost per litre: ");
		double cost = scanner.nextDouble();
		System.out.print("Starting fuel in litres: ");
		double gas = scanner.nextDouble();
		System.out.print("Your car's fuel effeciency: ");
		double fueleff = scanner.nextDouble();
		System.out.print("How far are you going in kms?: ");
		double distance = scanner.nextDouble();
		System.out.println(calculate.fuelcost(cost));
		// distance, starting fuel, fuel efficiency
	}

}
