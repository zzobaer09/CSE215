package class4;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int upperValue = 150;
		int lowerValue = 100;
		
		int i = upperValue;
		
		while(i>=lowerValue) {
			if(i%8==0) {
				System.out.println(i);
			}
			i--;
		}

	}

}
