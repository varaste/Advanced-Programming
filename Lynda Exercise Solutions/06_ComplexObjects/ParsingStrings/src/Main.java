
public class Main {

	public static void main(String[] args) {
		
		String s1 = "Welcome to California!";
		
		System.out.println("Length of string: " + s1.length());
		
		int pos = s1.indexOf("California");
		System.out.println("Position of California: " + pos);
		
		String sub = s1.substring(11);
		System.out.println(sub);
		
		String s2 = "Welcome!       ";
		int len1 = s2.length();
		System.out.println(len1);
		String s3 = s2.trim();
		System.out.println(s3.length());
		
	}

}
