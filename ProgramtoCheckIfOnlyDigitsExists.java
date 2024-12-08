#Program to check if only digits exists
package session_73_08_12_2024;
public class Checkifagivenstringcontainsonlydigits {
	public static void main(String[] args) {
		        String input = "1234567890";
		        StringBuilder sb = new StringBuilder(input);
		        boolean isAllDigits = true;
		        for (int i = 0; i < sb.length(); i++) {
		            if (!Character.isDigit(sb.charAt(i))) {
		                isAllDigits = false;
		                break;
		            }
		        }
		        if (isAllDigits) {
		            System.out.println("The string contains only digits.");
		        } else {
		            System.out.println("The string contains non-digit characters.");
		        }
	}

}
