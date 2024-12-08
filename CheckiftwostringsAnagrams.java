#Write a program to check if two strings are anagrams
package session_73_08_12_2024;
import java.util.Arrays;
public class CheckiftwoStringsareAnagrams {
	public static void main(String[] args) {
		        String str1 = "Listen";
		        String str2 = "Silent";
		        StringBuilder sb1 = new StringBuilder(str1.toLowerCase());
		        StringBuilder sb2 = new StringBuilder(str2.toLowerCase());
		        char[] arr1 = new char[sb1.length()];
		        char[] arr2 = new char[sb2.length()];

		        for (int i = 0; i < sb1.length(); i++) {
		            arr1[i] = sb1.charAt(i);
		        }
		        for (int i = 0; i < sb2.length(); i++) {
		            arr2[i] = sb2.charAt(i);
		        }
		        Arrays.sort(arr1);
		        Arrays.sort(arr2);
		        String sortedStr1 = new String(arr1);
		        String sortedStr2 = new String(arr2);
		        if (sortedStr1.equals(sortedStr2)) {
		            System.out.println("The strings are anagrams:"+str1+" "+str2);
		        } else {
		            System.out.println("The strings are not anagrams.");
		        }
	}

}
