package class1;

import java.util.Scanner;

public class CelToFahren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter Celsius: ");
		double c = sc.nextInt();
		double f = 0;
		
		// f = c*(9/5)+32;
		
		f = c*(9.0/5.0)+32;
		
		System.out.println("Fahrenheit value: "+f);
		
	}

}
