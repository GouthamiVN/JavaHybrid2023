package session72_01_12_2024;

public class IndexOf_SpecificarrayElement {

	public static void main(String[] args) {
		    
		        int[] numbers = {10, 20, 30, 40, 50};
		        int target = 30;
		        int index = -1;
		        for (int i = 0; i < numbers.length; i++) {
		            if (numbers[i] == target) {
		                index = i;
		                break; 
		            }
		        }
		        System.out.println("Index of " + target + " is: " + index);
	}

}
