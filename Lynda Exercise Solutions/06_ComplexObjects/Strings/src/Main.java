
public class Main {

	public static void main(String[] args) {
		String s1 = "Welcome to California!";
		String s2 = new String("WELCOME to California!");
		System.out.println(s2);
		
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("They match!");
		}
		else {
			System.out.println("They don't match!");
		}
		
		char[] chars = s1.toCharArray();
		for (char c : chars) {
			System.out.println(c);
		}
	}

}
