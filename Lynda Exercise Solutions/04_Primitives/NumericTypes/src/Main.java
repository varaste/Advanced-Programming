
public class Main {

	public static void main(String[] args) {
		
		//Declaring a literal byte value
		byte b = 127;
		System.out.println("the value of b is " + b);
		if (b < Byte.MAX_VALUE) {
			b++;
		}
		System.out.println("the value of b is " + b);
		
		//Declaring a short
		short sh = Short.MAX_VALUE;
		System.out.println("the value of sh is " + sh);
		
		// Declaring an int
		int i = Integer.MAX_VALUE;
		System.out.println("the value of i is " + i);

		// Declaring a long
		long l = Long.MAX_VALUE;
		System.out.println("the value of l is " + l);
		
		// Declaring a long
		float f = Float.MAX_VALUE;
		System.out.println("the value of f is " + f);
		
		// Declaring a long
		double d = Double.MAX_VALUE;
		System.out.println("the value of d is " + d);
		
	}

}
