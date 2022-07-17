package arrays.java;

import java.util.*;

public class RankTheArrays {

	public static void main(String[] args) {


		int [] arr = {10, 1, 30, 40, 50, 42};

		int [] newArr = new int [arr.length];


		for (int i = 0; i < arr.length; i++) {

			newArr[i] = arr[i];

		}

		Arrays.sort(newArr);


		Map<Integer, Integer> map = new HashMap<>();

		int degree = 1;
		
		for(int n : newArr) {

			if(!map.containsKey(n)) {

				map.put(n, degree);

				degree++;
			}
		}
		
		int [] ansArr = new int[arr.length];
		
		for (int i = 0; i < ansArr.length; i++) {
			
			ansArr[i] = map.get(arr[i]);		
			}

		System.out.println(Arrays.toString(ansArr));
	}
	

}
