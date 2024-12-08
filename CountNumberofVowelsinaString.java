# Count Number of Vowels in a String
package session_73_08_12_2024;
import java.util.*;
public class CountVowelsInString {
	public static void main(String[] args) {
		        String input = "Hello, how many vowels are in this string?";
		        StringBuilder sb = new StringBuilder(input.toLowerCase());
		        String vowels = "aeiou";
		        int count = 0;
		        for (int i = 0; i < sb.length(); i++) {
		            char ch = sb.charAt(i);
		            if (vowels.indexOf(ch) != -1) {
		                count++;
		            }
		        }
		        System.out.println("Number of vowels in the string: " + count);
	}

}
