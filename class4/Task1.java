package class4;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		int i = 1;
		while(i<=n) {
			System.out.println(i);
			i++;
		}
		
	}

}
