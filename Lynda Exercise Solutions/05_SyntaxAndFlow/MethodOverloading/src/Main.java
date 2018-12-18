
public class Main {

	public static void main(String[] args) {

		int value1 = 5;
		int value2 = 10;
		int value3 = 15;
		
		int result = addValues(value1, value2, value3);
		System.out.println("The result is " + result);
		
		String string1 = "10";
		String string2 = "25";
		int result2 = addValues(string1, string2);
		System.out.println("The result is " + result2);
		
	}

	private static int addValues(int int1, int int2) {
		return int1 + int2;
	}
	
	private static int addValues(int int1, int int2, int int3) {
		return int1 + int2 + int3;
	}
	
	private static int addValues(String val1, String val2) {
		int value1 = Integer.parseInt(val1);
		int value2 = Integer.parseInt(val2);
		return value1 + value2;
	}

}
