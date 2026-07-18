import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a,b,c = 0;
		System.out.print("Enter three sides of triangle: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		if(a+b>c&&b+c>a&&c+a>b)System.out.println("Triangle is valid");
		else System.out.println("Triangle not valid");
	}

}
