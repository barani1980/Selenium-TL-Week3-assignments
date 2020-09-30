package Week3.WeeklyAssignments;

public class FindTypes {

	public static void main(String[] args) {
		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		char[] myChar = test.toCharArray();
		int size = myChar.length;
		System.out.println(size);
		for (int i = 0; i < size; i++ ) {
			if (Character.isLetter(myChar[i])) {
				letter = letter + 1;
			}
			else if (Character.isDigit(myChar[i])) {
				num = num + 1;
			}
			else if (Character.isSpaceChar(myChar[i])) {
				space = space + 1;
			}
			else {
				specialChar = specialChar + 1;
			}
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharacter: " + specialChar);
	}

}
