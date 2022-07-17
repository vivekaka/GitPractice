package arrays.java;

import java.util.*;
public class ContainsDuplicateHashMap {

	public static void main(String[] args) {

		int nums [] = {1, 2, 4, 5, 6};

		boolean containsDupe = true;

		Set<Integer> set = new HashSet<Integer>();

		for(Integer num : nums) {

			if(!set.add(num)) {
				containsDupe = true;
				break;

			}
			else {
				containsDupe = false;


			}
		}
		
		System.out.println(containsDupe);
	}

}
