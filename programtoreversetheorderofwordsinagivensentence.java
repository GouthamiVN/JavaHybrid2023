#program to reverse the order of words in a given sentence
package session_73_08_12_2024;
public class Reverseorderofwordsinsentence {
	public static void main(String[] args) {
		        String input = "Hello world this is Java";
		        StringBuilder sb = new StringBuilder(input);
		        String[] words = input.split(" ");
		        StringBuilder reversedSentence = new StringBuilder();
		        for (int i = words.length - 1; i >= 0; i--) {
		            reversedSentence.append(words[i]);
		            if (i != 0) {
		                reversedSentence.append(" ");
		            }
		        }
		        System.out.println("Reversed sentence: " + reversedSentence.toString());
	}

}
