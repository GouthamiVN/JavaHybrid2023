#Write a program to remove all whitespace characters from a string
package session_73_08_12_2024;
public class Removeallwhitespacecharactersstring {
	public static void main(String[] args) {
		        String input = "  Hello   World!   Java Programming. ";
		        StringBuilder sb = new StringBuilder(input);
		        for (int i = 0; i < sb.length(); i++) {
		            if (Character.isWhitespace(sb.charAt(i))) {
		                sb.deleteCharAt(i);
		                i--;
		            }
		        }
		        System.out.println("String after removing whitespaces: " + sb.toString());
	}

}
