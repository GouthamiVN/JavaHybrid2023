package session72_01_12_2024;

public class CheckIf_SortedInAscendingOrder {

	public static void main(String[] args) {
		        int[] numbers = {1, 2, 3, 4, 5};
		        boolean isSorted = true;
		        for (int i = 0; i < numbers.length - 1; i++) {
		            if (numbers[i] > numbers[i + 1]) {
		                isSorted = false;  
		                break;             
		            }
		        }
		        if (isSorted) {
		            System.out.println("The array is sorted in ascending order.");
		        } else {
		            System.out.println("The array is not sorted in ascending order.");
		        }
	}

}
