package Week3.WeeklyAssignments;

public class ReverseString {

	public static void main(String[] args) {
		String test = "feeling good";
		char[] myChar = test.toCharArray();
		
		for (int i = myChar.length-1; i >= 0; i--) {
			System.out.print(myChar[i]);
		}
		
		
	}

}
