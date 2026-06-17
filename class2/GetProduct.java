package class1;

import java.util.Scanner;

public class GetProduct {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter number: ");
		double a = sc.nextInt();
		
		System.out.print("enter number: ");
		double b = sc.nextInt();
		
		System.out.println("Product is: "+(a*b));
	}

}
