package Week3.WeeklyAssignments;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		int sum = 0;
		
		String text1 = text.replaceAll("\\D","");
		System.out.println("Original text is: " + text);
		System.out.println("Retain digits using Regular Expression: " + text1);
		
		char[] myChar = text.toCharArray();
		String str = "";
		
		for (int i = 0; i < myChar.length; i++) {
			if (Character.isDigit(myChar[i]) ) {
				str = str + myChar[i];
			}
		}
		System.out.println("Retain digits using isDigit : " + str);
		
		char[] num = str.toCharArray();
		
		for (int j=0; j<num.length; j++) {
			int numericValue = Character.getNumericValue(num[j]);
			sum = sum + numericValue;
		}
		System.out.println("Sum of digits = " + sum);
	}

}
