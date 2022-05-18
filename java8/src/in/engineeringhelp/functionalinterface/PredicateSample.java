package in.engineeringhelp.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateSample {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		// without predicate
		System.out.println(totalValue(numbers));
		System.out.println(totalEvenValue(numbers));
		System.out.println(totalOddValue(numbers));
		
		// with predicate: Strategy pattern 
		System.out.println(totalSumFilter(numbers, e -> true));
		System.out.println(totalSumFilter(numbers, e -> e%2==0));
		System.out.println(totalSumFilter(numbers, e -> e%2!=0));
		
	}
	
	
	// Normal Life 
	private static int totalValue(List<Integer> numbers) {
		int total = 0;
		for(int e: numbers) {
			total += e;
		}
		
		return total;
	}
	
	private static int totalEvenValue(List<Integer> numbers) {
		int total = 0;
		for(int e: numbers) {
			if(e%2 ==0) {
				total += e;
			}
		}
		
		return total;
	}
	
	private static int totalOddValue(List<Integer> numbers) {
		int total = 0;
		for(int e: numbers) {
			if(e%2 !=0) {
				total += e;
			}
		}
		
		return total;
	}
	
	// Mentos Life :)
	public static int totalSumFilter(List<Integer> nums, Predicate<Integer> slector) {
		
		/*
		 * int total = 0;
		 * 
		 * for(int e: nums) { if(slector.test(e)) { total+=e; }
		 * 
		 * }
		 * 
		 * return total;
		 */
		
		return nums.stream()
				.filter(slector)
				.mapToInt(e->e)
				.sum();
	}

}
