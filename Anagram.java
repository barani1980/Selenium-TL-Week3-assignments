package Week3.WeeklyAssignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "st3ps"; 
		String text2 = "potss";
		char[] char1 = text1.toCharArray();
		char[] char2 = text2.toCharArray();
		int size1 = char1.length;
		int size2 = char2.length;
		int count = 0;
			
		if (size1 != size2) {
			System.out.println("The strings are of different lengths and cant be compared");
		}
		else {
			Arrays.sort(char1);
			Arrays.sort(char2);
		
		for (int i = 0; i < size1; i++ ) {
			if (char1[i] == char2[i]) {
				count = count + 1;
			}
		}
			if (count == size1) {
				System.out.println("These 2 strings - " + text1 + " & " + text2 + " are Anagrams");
			}
			else {
			System.out.println("These 2 strings - " + text1 + " & " + text2 + " are not Anagrams");
			}
		}	
	}

}
