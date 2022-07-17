package arrays.java;

import java.util.Arrays;

public class MoveZerosToTheEnd {

	public static void main(String[] args) {

		int [] arr = {1, 3, 0, 5, 0, 7, 0, 9};

		//		Arrays.sort(arr);
		//		
		//		System.out.println(Arrays.toString(arr));

		int len = arr.length;

		int count = 0;

		for(int i=0; i<len; i++) {

			if(arr[i] != 0) {

				arr[count++] = arr[i];

			}

		}


		while(count < len) {
			arr[count++] = 0;
		}

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i]+" ");

		}
	}

}
