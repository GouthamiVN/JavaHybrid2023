package session72_01_12_2024;

import java.util.Scanner;

public class EvenOddElementsIn_Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n = scan.nextInt();
		System.out.println("Enter the array elements: ");
		int[] numbers = new int[n];
		for(int i=0;i<n;i++) {
			numbers[i]=scan.nextInt();
		}
		int evenCount=0;
		int oddCount=0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		System.out.println("Even numbers count: "+evenCount);
		System.out.println("Odd numbers count: "+oddCount);
	}
}
