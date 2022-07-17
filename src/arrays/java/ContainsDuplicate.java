package arrays.java;

import java.util.Arrays;

public class ContainsDuplicate {


	public static void main (String[] args) {

		int [] nums = {1};

		Arrays.sort(nums);

		boolean isAvailable = true;
		
		if(nums.length <= 1) {
			
			isAvailable = false;
		}

		for(int i=0; i< nums.length-1; i++) {

			if(nums[i] == nums[i+1]) {

				isAvailable = true;
				break;

			}

			else {

				isAvailable = false;

			}
		}

		System.out.println(isAvailable);
	}

}
