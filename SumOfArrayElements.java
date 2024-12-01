package session72_01_12_2024;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n = scan.nextInt();
		System.out.println("Enter the array elements: ");
		int[] numbers = new int[n];
		for(int i=0;i<n;i++) {
			numbers[i]=scan.nextInt();
		}
		int sum = 0;
		for(int i=0;i<numbers.length;i++) {
			sum =  sum + numbers[i];
		}
		System.out.println("The sum of array elements: "+sum);
	}

}
