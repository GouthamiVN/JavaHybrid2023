#Remove Duplicates from a String
package session_72_08_12_2024;
public class RemoveDuplicatesfromaString {
	public static void main(String[] args) {
		        String input = "programming";
		        StringBuilder sb = new StringBuilder();
		        for (int i = 0; i < input.length(); i++) {
		            char ch = input.charAt(i);
		            if (sb.indexOf(String.valueOf(ch)) == -1) {
		                sb.append(ch); 
		            }
		        }
		        System.out.println("String after removing duplicates: " + sb.toString());
	}
}
