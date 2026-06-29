import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b,c = 0;
		System.out.print("Enter three numbers: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		if (a>b) {
			if (a>c) {
				System.out.println(a);				
			} else {
				System.out.println(c);
			}
		} else {
			System.out.println(b);
		}
	}

}
