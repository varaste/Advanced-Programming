
public class Main {
	
	public static void main(String[] args) {
		
		String[][] states = new String[3][2];
		states[0][0] = "California";
		states[0][1] = "Sacramento";
		states[1][0] = "Oregon";
		states[1][1] = "Salem";
		states[2][0] = "Washington";
		states[2][1] = "Olympia";
		
		for (int i = 0; i < states.length; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < states[i].length; j++) {
				if (j == 0) {
					sb.append("The capitol of ");
				}
				else {
					sb.append(" is ");
				}
				
				sb.append(states[i][j]);
			}
			System.out.println(sb);
		}
		
	}

}
