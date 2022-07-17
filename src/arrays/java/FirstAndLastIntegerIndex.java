package arrays.java;

import java.util.Arrays;

public class FirstAndLastIntegerIndex {

	public static void main (String[] args) {


		int nums [] = {1, 4, 4, 5, 6, 7};

		int target = 4;

		int [] numAns = new int [] {-1, -1};

		boolean leftFound = false;

		boolean rightFound = false;

		int leftIndx = 0;

		int rightIndx = nums.length-1;
		
		if(nums.length == 0) {

			System.out.println(Arrays.toString(numAns));
		}
		
		while(leftIndx < rightIndx) {

		if(nums[leftIndx] == target) {

			numAns[0] = leftIndx;

			leftFound = true;
		}

		if(nums[rightIndx] == target) {

			numAns[1] = rightIndx;

			rightFound = true;
		}

		if(!leftFound) {
			
			leftIndx++;
		}
		
		if(!rightFound) {
			rightIndx--;
		}
		
		if (leftFound && rightFound) {
			
			break;
		}
		}
		
		System.out.println(Arrays.toString(numAns));
		
	}

}
