package Week3.WeeklyAssignments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionApplyList {

	public static void main(String[] args) {
		
		int[] first = {3,2,11,4,6,7};
		int[] second = {1,2,8,4,9,7};
		List<Integer> ss = new ArrayList<Integer> () ;
		for (int i = 0; i < first.length; i++) {
			for( int j=0; j < second.length; j++) {
				if (first[i] == second[j]) {
					System.out.println(first[i]);
					ss.add(first[i]);
					
				}
			}
		}

	}

}
