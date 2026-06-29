import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter working duration in the company: ");
		int year = input.nextInt();
		if (year>2) {
			System.out.println("Eligible for bonus");
		} else {
			System.out.println("Not eligible for bonus");
		}
		
	}

}
