package class7;
import java.util.Iterator;
import java.util.Scanner;
public class task1 {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter element number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		
		double avg = (double)sum/n;
		
		int counter = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]>avg) counter++;
		}
		System.out.println(avg);
		System.out.println(""+(counter*100.0/n)+"%");
	}

}
