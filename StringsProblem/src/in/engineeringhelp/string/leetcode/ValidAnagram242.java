package in.engineeringhelp.string.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram242 {

	public static boolean isAnagram(String s, String t) {

		if (s.length() != t.length())
			return false;

		Map<Character, Integer> sMap = new HashMap<Character, Integer>();
		Map<Character, Integer> tMap = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			if (!sMap.containsKey(s.charAt(i))) {
				sMap.put(s.charAt(i), 1);
			} else {
				sMap.put(s.charAt(i), sMap.get(s.charAt(i)) + 1);
			}
			if (!tMap.containsKey(t.charAt(i))) {
				tMap.put(t.charAt(i), 1);
			} else {
				tMap.put(t.charAt(i), tMap.get(t.charAt(i)) + 1);
			}
		}

		if (sMap.equals(tMap)) {
			return true;
		}

		return false;
	}

	public static boolean isAnagramOptimized(String s, String t) {

		if (s.length() != t.length())
			return false;

		char ch1[] = s.toCharArray();
		char ch2[] = t.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] != ch2[i]) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		System.out.println(isAnagram("anagram", "nagaram"));
		System.out.println(isAnagram("rat", "car"));

		System.out.println(isAnagramOptimized("anagram", "nagaram"));
		System.out.println(isAnagramOptimized("rat", "car"));
	}

}
