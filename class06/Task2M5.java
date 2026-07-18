import java.util.Scanner;

public class Task2M5 {
	public static boolean isPalidrome(String arg) {
		String rev_str = "";
		for(int i=arg.length()-1;i>=0;i--) {
			rev_str+=arg.charAt(i);
		}
		for(int i=0;i<arg.length();i++) {
			if(rev_str.charAt(i)!=arg.charAt(i)) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		boolean b = isPalidrome(sc.nextLine());
		System.out.println(b);
	}

}
