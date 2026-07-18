import java.util.Iterator;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		System.out.print("enter array len: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		int[] num = new int[n];
		for(int i=0; i<n; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("-----------");
		for (int i : num) {
			System.out.println(i);
		}
	}

}
