package assignments.lab2;
import java.util.Scanner;
public class Q05_taxAndTip {

	public static void main(String[] args) {
		
		
//		Write a program that computes the tax and tip on a restaurant bill.
//		The program should ask the user to enter the charge for the meal. The tax should be 6.75 percent of the meal charge. 
//		The tip should be 20 percent of the total after adding tax. 
//		Display the meal charge, tax amount, tip amount, and total bill on the screen.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the charge for the meal:");
		double charge=scan.nextDouble();
		
		double tax=charge*6.75/100;
		double tip=(charge+tax)*20/100;
		double total=tax+tip+charge;
		
		System.out.println("Meal charge:"+charge);
		System.out.println("Tax amount:"+tax);
        System.out.println("Tip amount:"+tip);
		System.out.println("Totall Bill:"+total);
	}

}
