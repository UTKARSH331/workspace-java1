
public class Anagram {

	
	public static boolean anagram(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		char ch[] = s1.toCharArray();
		char ch1[] = s2.toCharArray();
		java.util.Arrays.sort(ch);
		java.util.Arrays.sort(ch1);
		for(int i =0; i<ch.length; i++) {
			if(ch[i] != ch1[i]) {
				return false;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		
		  
		        // Example strings to check if they are anagrams
		        String Str1 = "INTEGER";
		        String Str2 = "TEGERNI";

		        // Check if the strings are anagrams and output the result
		        if (anagram(Str1, Str2)) {
		            System.out.println("True");  // Output "True" if they are anagrams
		        } else {
		            System.out.println("False");  // Output "False" if they aren't anagrams
		        }
		    }
		// TODO Auto-generated method stub

	

}
