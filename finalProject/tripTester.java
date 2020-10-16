package finalProject;

import java.util.Scanner;

public class tripTester {
	
	public static void main(String args[])
	{
		int careff[] = {0,10,20,30};
		int ow = careff[0];
		int bmw = careff[1];
		int lexus = careff[2];
		int toyota = careff[3];
		
		tripCalculator calculate = new tripCalculator();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("fuel cost per litre: ");
		double cost = scanner.nextDouble();
		System.out.print("Starting fuel in litres: ");
		double gas = scanner.nextDouble();
		System.out.print("Which car will you be using\n 1: bmw\n 2: lexus \n 3: toyota \n 1");
		int fueleff = scanner.nextInt();
	
		System.out.print("How far are you going in kms?: ");
		double distance = scanner.nextDouble();
		System.out.println(calculate.totalfuel());
		// distance, starting fuel, fuel efficiency
		
		switch(careff[fueleff])
		{
		
		}
	}

}
