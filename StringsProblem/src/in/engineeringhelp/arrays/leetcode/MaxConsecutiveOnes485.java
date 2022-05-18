package in.engineeringhelp.arrays.leetcode;

public class MaxConsecutiveOnes485 {
	
	public static int findMaxConsecutiveOnes(int[] nums) {
		int maxValue = 0;
		int count=0;
		for(int n: nums) {
			if(n==1) {
				count++;
				maxValue = Math.max(maxValue, count);
			}else {
				count=0;
			}
		}
		
		return maxValue;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,1,0,0,1,1,1,0,0,1,1,1,1};
		System.out.println(findMaxConsecutiveOnes(arr));
	}

}
