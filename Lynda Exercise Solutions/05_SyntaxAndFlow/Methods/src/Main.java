
public class Main {

	public static void main(String[] args) {
		doSomething();
		
		loopMe();
		
	}

	private static void loopMe() {
		int top = 10;
		for (int i = 0; i < top; i++) {
			System.out.println("the value is " + i);
		}
	}
	
	private static void doSomething() {
		System.out.println("This method has been called");
	}

}
