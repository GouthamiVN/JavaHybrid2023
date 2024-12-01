package session72_01_12_2024;

import java.util.Scanner;

public class MergeTwoArray_IntoThirdArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int n1 = scan.nextInt();
		System.out.println("Enter the array1 elements: ");
		int[] arr1 = new int[n];
		System.out.println("Enter the array2 elements: ");
		int[] arr2 = new int[n1];
		int[] mergedArray = new int[arr1.length+arr2.length];
		for(int i=0;i<n;i++) {
			arr1[i]=scan.nextInt();
		}
		for(int i=0;i<n1;i++) {
			arr2[i]=scan.nextInt();
		}
		for (int i = 0; i < arr1.length; i++) {
            mergedArray[i] = arr1[i];
        }
		for (int i = 0; i < arr2.length; i++) {
			 mergedArray[arr1.length + i] = arr2[i];
        }
		for(int i=0;i<mergedArray.length;i++) {
			System.out.print(mergedArray[i]+" ");
	}
		
    }

}
