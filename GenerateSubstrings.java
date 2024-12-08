#Program to generate all substrings
package session_73_08_12_2024;
public class GenerateAllSubstrings {
	public static void main(String[] args) {
		        String input = "right";
		        StringBuffer sb = new StringBuffer(input);
		        for (int i = 0; i < sb.length(); i++) {
		            for (int j = i + 1; j <= sb.length(); j++) {
		                String substring = sb.substring(i, j);
		                System.out.println(substring);
		            }
		        }
	}
}
