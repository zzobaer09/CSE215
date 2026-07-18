import java.util.Scanner;

public class Task1M5 {
	
	public static int countVowels(String str) {
		int counter = 0;
		str = str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			char temp =str.charAt(i); 
			if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u') {
				counter++;
			}
		}
		return counter;
	}
	public static int countVowelsInArray(String[] arr) {
		int counter = 0;
		for (String str : arr) {			
			str = str.toLowerCase();
			for(int i=0;i<str.length();i++) {
				char temp =str.charAt(i); 
				if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u') {
					counter++;
				}
			}
		}
		return counter;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		String s = sc.nextLine();
		System.out.println(countVowels(s));
	}
}
