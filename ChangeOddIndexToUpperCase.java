package Week3.WeeklyAssignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String test = "changeme";
		String rev = "";
		
		char[] myChar = test.toCharArray();
		int lg = myChar.length;
		
		System.out.println("Original string is : " + test);
		
		for (int i = 0; i < lg; i++) {
			if (i%2 != 0) {
				myChar[i] = Character.toUpperCase(myChar[i]);
			}
		rev = rev + myChar[i];				
		}
		
		System.out.println("Odd Index changed to Upper case value = " + rev);
	}

}
