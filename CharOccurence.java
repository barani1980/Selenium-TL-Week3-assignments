package Week3.WeeklyAssignments;

public class CharOccurence {

	public static void main(String[] args) {
		
		String str = "welcome to chennai";
		int count = 0;
		char[] myChar = str.toCharArray();
		int leng = myChar.length ;
		char check = 'e';
		
		for (int i = 0; i < leng; i++) {
			if (myChar[i] == check) {
				count = count + 1;
			}
		}
		
		System.out.println("Given string = " + str);
		System.out.println(check + " appears " + count + " times in the given string ");
		
		
	}

}
