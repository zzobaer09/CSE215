package class1;

import java.util.Scanner;

public class FindVolume {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//		cube
		System.out.print("enter side of a cube: ");
		double a = sc.nextInt();
		System.out.println("Volume of cube: "+(a*a*a));

		//		Cylinder
		System.out.println("Enter radius of Cylinder: ");
		double r = sc.nextInt();
		System.out.println("Enter height of Cylinder: ");
		double h = sc.nextInt();
		System.out.println("Volume of cube: "+(Math.PI*r*r*h));
	}

}
