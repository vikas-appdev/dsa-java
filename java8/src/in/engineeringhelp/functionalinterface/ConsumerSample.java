package in.engineeringhelp.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerSample {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		// external iterator
		for(int i=0; i<numbers.size(); i++) {
			System.out.print(numbers.get(i));
		}
		System.out.println();
		System.out.println("=======External Iterator: Enhanced for loop========");
		// external iterator: enhanced for
		for(int e: numbers) {
			System.out.print(e);
		}
		System.out.println();
		System.out.println("=======Enternal Iterator : For each==========");
		// internal iterator
		numbers.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.print(t);
				
			}
		});
		System.out.println();
		System.out.println("=====Using lambda===========");
		// internal iterator lambda way 
		numbers.forEach((value)->System.out.print(value));
		
		System.out.println();
		System.out.println("=========Method Reference=========");
		numbers.forEach(System.out::print);
	}
}
