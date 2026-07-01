package class4;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		int min = 5;
		int max = 20;
		int n = (int) (Math.random()*(max-min+1))+min;
		System.out.println("Random number: "+n);
		for(int i=0;i<=n;i++) {
			System.out.print(i+" ");
		}
	}

}
