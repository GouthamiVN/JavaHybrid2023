#Write a program that toggles the case of all characters in a given string.
package session_73_08_12_2024;
public class TogglesCaseofallcharacters {
	public static void main(String[] args) {
		        String input = "Hello World! Java Programming.";
		        StringBuilder sb = new StringBuilder(input);
		        for (int i = 0; i < sb.length(); i++) {
		            char ch = sb.charAt(i);
		            if (Character.isUpperCase(ch)) {
		                sb.setCharAt(i, Character.toLowerCase(ch));
		            } else if (Character.isLowerCase(ch)) {
		                sb.setCharAt(i, Character.toUpperCase(ch));
		            }
		        }
		        System.out.println("String after toggling case: " + sb.toString());
	}

}
