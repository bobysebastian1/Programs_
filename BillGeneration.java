package Demo;
import java.util.Scanner;
public class BillGeneration {

	public static void main(String[] args) {
		int pizzas,puffs,coolDrinks;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF PIZZAS BOUGHT:");
		pizzas = sc.nextInt();
		System.out.println("ENTER THE NUMBER OF PUFFS BOUGHT:");
		puffs = sc.nextInt();
		System.out.println("ENTER THE NUMBER OF COOL DRINKS BOUGHT:");
		coolDrinks = sc.nextInt();
		
		System.out.println("Number of Pizzas : " +pizzas);
		System.out.println("Number of Puffs : " +puffs);
		System.out.println("Number of coolDrinks : " +coolDrinks);
		System.out.println("Total Amount : " +(pizzas*100+puffs*20+coolDrinks*10));
		System.out.println("ENJOY THE SHOW");

	}

}
