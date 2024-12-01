package session72_01_12_2024;

public class CountOfPositive_andNegativeElements {

	public static void main(String[] args) {
		        int[] numbers = {10, -5, 20, -3, -8, 15, 0};	     
		        int positiveCount = 0;
		        int negativeCount = 0;
		        int zeroCount = 0;		       
		        for (int num : numbers) {
		            if (num > 0) {
		                positiveCount++;  
		            } else if (num < 0) {
		                negativeCount++;  
		            } else {
		                zeroCount++;      
		            }
		        }
		        System.out.println("Number of positive numbers: " + positiveCount);
		        System.out.println("Number of negative numbers: " + negativeCount);
		        System.out.println("Number of zero values: " + zeroCount);  
	}

}
