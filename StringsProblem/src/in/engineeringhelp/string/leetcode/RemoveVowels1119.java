package in.engineeringhelp.string.leetcode;

import java.util.HashSet;
import java.util.Set;

public class RemoveVowels1119 {
	
	// Given a string s, remove the vowels 'a', 'e', 'i', 'o', 'u' from it and return the new String
	public static void main(String[] args) {
		System.out.println(removeVowels("vikas"));
	}
	
	public static String removeVowels(String s) {
		Set<Character> vowels = new HashSet<Character>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		
		StringBuilder builder = new StringBuilder();
		for(char c : s.toCharArray()) {
			if(!vowels.contains(c)) {
				builder.append(c);
			}
		}
		return builder.toString();
	}

}
