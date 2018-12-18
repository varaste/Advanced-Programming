
public class SwitchWithEnums {

	public static void main(String[] args) {

//		int month = 1;
		Month month = Month.FEBRUARY;
		
		switch(month) {
		case JANUARY:
			System.out.println("It's the first month");
			break;
		case FEBRUARY:
			System.out.println("It's the second month");
			break;
		case MARCH:
			System.out.println("It's the third month");
		}

	}

}
