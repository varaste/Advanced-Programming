import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("California");
		list.add("Oregon");
		list.add("Washington");
		
		System.out.println(list);
		
		list.add("Alaska");
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		
		String state = list.get(1);
		System.out.println("The second state is " + state);

		int pos = list.indexOf("Alaska");
		System.out.println("Alaska is at position " + pos);
		
	}

}
