package in.engineeringhelp.functionalinterface;

public class ThreadSample {
	public static void main(String[] args) {
		System.out.println("Main starts...");
		// pre-java8
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Pre java-8 thread");
			}
		});
		
		thread.start();
		// java 8 lambda way
		thread = new Thread(()->System.out.println("Java 8 Lambda way"));
		thread.start();
		
		System.out.println("Main ends...");
	}

}
