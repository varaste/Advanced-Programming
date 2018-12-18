
public class Main {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("The value of b1 is " + b1);
		System.out.println("The value of b2 is " + b2);
		
		boolean b3 = !b1;
		System.out.println("The value of b3 is " + b3);
		
		int i = 0;
		boolean b4 = (i != 0);
		System.out.println("The value of b4 is " + b4);

		String s = "true";
		boolean b5 = Boolean.parseBoolean(s);
		System.out.println("The value of b5 is " + b5);

		
	}

}
