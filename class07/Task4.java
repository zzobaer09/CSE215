package class07;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length: ");
		
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n - 2; i++) {
            if (arr[i] == arr[i + 1] && arr[i] == arr[i + 2]) {
                System.out.print(arr[i] + " ");
                i += 1; 
            }
		}
		
	}

}
