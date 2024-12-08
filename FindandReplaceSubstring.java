#Find and Replace Substring
package session_73_08_12_2024;
public class FindandReplaceSubstring {
		    public static void main(String[] args) {
		        String original = "Hello world! Welcome to the world of Java.";
		        String toFind = "world";
		        String toReplace = "universe";
		        StringBuffer sb = new StringBuffer(original);
		        int index = sb.indexOf(toFind); 
		        while (index != -1) {
		            sb.replace(index, index + toFind.length(), toReplace);
		            index = sb.indexOf(toFind, index + toReplace.length());
		        }
		        System.out.println("Modified string: " + sb.toString());
	}

}
