package Week3.WeeklyAssignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String b1 = "I am a software tester"; 
		String[] split = b1.split(" ");
		String b2 = "";
		
		for ( int i = 0; i < split.length; i++) {
			if (i%2 != 0) {
				String temp = "";
				char[] part = split[i].toCharArray();
				for (int j = part.length-1; j >= 0; j--) {
					temp = temp + part[j];
				}
			split[i] = temp;	
			}
		b2 = b2 + split[i] + " ";	
		}
	System.out.println("Original string is : " + b1);	
	System.out.println("Reversed even words : " + b2);
	}

}
