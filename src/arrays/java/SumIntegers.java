package arrays.java;

public class SumIntegers {

	public static void main(String[] args) {

		int num = 123;
		
		int rev = 0;
		
		while (num != 0) {
			
			rev = rev + num%10;
						
			num = num/10;
		}
		
		System.out.println(rev);
	}

}
