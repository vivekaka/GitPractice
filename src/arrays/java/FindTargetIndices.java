package arrays.java;

import java.util.*;

public class FindTargetIndices {

	public static void main(String[] args) {

		int [] arr = {1, 5, 2, 7, 3, 2};
		
		int target = 2;
		
		Arrays.sort(arr);
		
		List<Integer> lst = new LinkedList<>();
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == target) {
				
				lst.add(i);
			}
			
		}
		
		System.out.println(lst);
		
	}

}
