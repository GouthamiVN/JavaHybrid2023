package session72_01_12_2024;

import java.util.Scanner;

public class SecondLargestElement_InArray {
    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest; 
                largest = num;          
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;   
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}
