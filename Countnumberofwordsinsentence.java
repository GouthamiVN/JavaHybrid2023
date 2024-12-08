#Write a program to count the number of words in a sentence
package session_73_08_12_2024;
public class Countnumberofwordssentence {
	public static void main(String[] args) {
		        String input = "Hello, how are you doing today?";
		        StringBuffer sb = new StringBuffer(input);
		        int totalCount = sb.length();
		        System.out.println("Total number of characters (including words, whitespaces, and special characters): " + totalCount);

	}

}
