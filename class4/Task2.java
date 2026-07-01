package class4;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		int flag = -1;
		for(int i=2; i<n;i++) {
			if(n%i==0) {
				System.out.println("Not Prime");
				flag = 1;
				break;
			}
		}
		if(flag == -1) {
			System.out.println("Prime");
		}
		
	}
}
