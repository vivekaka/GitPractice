package arrays.java;

public class FindTheDupe {
	
	public static void main(String[] args) {
		
		int [] arr = {2, 5, 6, 7, 7, 9, 9, 10, 10};
		
		int len = arr.length;
		
		for(int i=0; i < len-1; i++) {
			
			if(arr[i] == arr[i+1]) {
				
				System.out.print(arr[i]+" ");
			}
			
		}
		
	}

}
