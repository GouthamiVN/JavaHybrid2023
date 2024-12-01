package session72_01_12_2024;

import java.util.Scanner;

public class LargestElement_inArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n = scan.nextInt();
		System.out.println("Enter the array elements: ");
		int[] numbers = new int[n];
		for(int i=0;i<n;i++) {
			numbers[i]=scan.nextInt();
		}
		int largest = numbers[0];
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest = numbers[i];
			}
		}
		System.out.println("Largest element: "+largest);
	}
}