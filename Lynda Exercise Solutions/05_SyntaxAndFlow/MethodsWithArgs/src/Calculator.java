import java.io.*;

public class Calculator {

	public static void main(String[] args) {
		String s1 = getInput("Enter a numeric value: ");
		String s2 = getInput("Enter a numeric value: ");

		double result = addTwoValues(s1, s2);
		
		System.out.println("The answer is " + result);
		
		double resultOfMultiple = addMultipleValues(1,2,3,4,5);
		System.out.println("The answer from multiple values is " + resultOfMultiple);
		
	}

	private static double addTwoValues(String s1, String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		double result = d1 + d2;
		return result;
	}
	
	private static String getInput(String prompt) {
		BufferedReader stdin = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.print(prompt);
		System.out.flush();
		
		try {
			return stdin.readLine();
		} catch (Exception e) {
			return "Error: " + e.getMessage();
		}
	}
	
	private static double addMultipleValues(double ... values) {
		double result = 0d;
		for (double d : values) {
			result += d;
		}
		return result;
	}

}
