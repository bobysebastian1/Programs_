package Demo;

import java.util.Scanner;

public class FuelCalculator {

	public static void main(String[] args) {
		double litres,distance;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of liters to fill the tank:");
		litres = sc.nextInt();
		System.out.println("Enter the distance covered:");
		distance = sc.nextInt();
		if (  litres<= 0 ) {
			System.out.println("Invalid Input");
		}
		else if (  distance<= 0 ){
			System.out.println("Invalid Input");
		}
		else{
		double costs = (litres*100/distance);
		System.out.printf("Litres/100KM : %.2f ",costs);
		System.out.println("");
		double milespergallons =((distance / (litres*0.2642) * 0.6214));
		System.out.printf("Miles/Gallons : %.2f ",milespergallons);
		}
	}

}
