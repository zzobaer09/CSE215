
public class Quiz {
	
	public static double calculateAverage(int[] temp) {
		
		double avg = 0;
		int n = temp.length;
		int sum = 0;
		for(int i =0; i<n;i++) {
			sum += temp[i];
		}
		avg = (double) sum/n;
		return avg;
	}
	public static void printHighLowVsAverage(int[] temp) {
		int max = temp[0];
		int min = temp[0];
		int n = temp.length;
		
		for(int i = 0; i<n;i++) {
			if(max<temp[i]) max = temp[i];
			if(min>temp[i]) min = temp[i];
		}
		double avg = calculateAverage(temp);
		double a = max-avg;
		double b = avg-min;
		System.out.println("Highest: "+max+"("+a+" above average)");
		System.out.println("Lowest: "+min+"("+b+" below average)");
	}
	public static void main(String[] args) {
		int[] temp = {32,33,31,35,34,30,32};
		double avg = calculateAverage(temp);
		System.out.println("--Dhaka,Bangladesh: July 2026 Temperature Report---");
		System.out.println("Average temperature: "+avg);
		printHighLowVsAverage(temp);
		
		int n = temp.length;
		
		for(int i =0; i<n;i++) {
			if(temp[i]>avg) {
				System.out.println("Day "+(i+1)+": "+temp[i]+"->"+"Above average");
			}else {
				System.out.println("Day "+(i+1)+": "+temp[i]+"->"+"Below average");
			}
		}
		
		
	}

}
