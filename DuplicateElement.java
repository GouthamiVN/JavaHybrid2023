package session72_01_12_2024;
public class DuplicateElementsInArray {
	public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 20, 50, 30};

        System.out.println("Duplicate elements are:");
        for(int i = 0; i < numbers.length;i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                for (int k = i + 1; k < numbers.length; k++) {
                    if (numbers[i] == numbers[k]) {
                        System.out.println(numbers[i]);
                        break;
                    }
                }
            }
        }

    }
}