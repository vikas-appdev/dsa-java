package in.engineeringhelp.arrays.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {
	
	// Bruteforce
	public static boolean containsDuplicate(int[] nums) {
		
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i]==nums[j]) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	// Optimized
	public static boolean containsDuplicateOptimized(int[] nums) {
		Set<Integer> numSet = new HashSet<Integer>();
		
		for(int num: nums) {
			if(!numSet.add(num)) {
				return true;
			}
			
			/*
			 * if(numSet.contains(num)) return true; numSet.add(num);
			 */
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,1};
		System.out.println(containsDuplicate(arr));
		System.out.println(containsDuplicateOptimized(arr));
		
		int arr2[] = {1,2,3,4};
		System.out.println(containsDuplicate(arr2));
		System.out.println(containsDuplicateOptimized(arr2));
		
		int arr3[] = {1,1,1,3,3,4,3,2,4,2};
		System.out.println(containsDuplicate(arr3));
		System.out.println(containsDuplicateOptimized(arr3));
	}

}
