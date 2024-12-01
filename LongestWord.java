package session72_01_12_2024;

import java.util.Scanner;

public class Longest_Word_In_Sentence {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = scan.nextLine();
		String[] words = sentence.split(" ");
		String longestWord = words[0];
		for(String word: words) {
			if(word.length() > longestWord.length()) {
				longestWord = word;
			}
		}
		System.out.println("The longest word is: "+longestWord);
	}

}
