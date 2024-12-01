package session72_01_12_2024;

public class ShiftArrayPosition_toright {

	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40, 50};
		int lastElement = numbers[numbers.length - 1];
		for (int i = numbers.length - 2; i >= 0; i--) {
			numbers[i + 1] = numbers[i];
		}
		numbers[0] = lastElement;
		System.out.print("Array after shifting elements to the right by one position: ");
		for (int num : numbers) {
			System.out.print(num + " ");
		}
	}
}
