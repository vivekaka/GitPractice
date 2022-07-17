package practice.java;

import java.util.*;

public class Arrays_Ranking {

	public static void main(String[] args) {

		int [] arr = {10, 30, 20, 50, 60, 40};
		
		int [] len = new int [arr.length];
		
		for(int i=0; i < arr.length; i++) {
			
			len[i] = arr[i];
		}
		
		Arrays.sort(len);
		
		Map<Integer, Integer> map = new HashMap<>();
		
		int degree = 1;

		for(int n : len) {
			
			if(!map.containsKey(n)) {
				
				map.put(n, degree);
				
				degree++;
			}
			
		}
		
		int [] ansArr = new int [arr.length];
		
		for(int i=0; i < arr.length; i++) {
			
			ansArr[i] = map.get(arr[i]);
		}
		
		System.out.println(Arrays.toString(ansArr));
	}

}
