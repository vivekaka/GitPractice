package arrays.java;

public class FibonacciSeries {

	public static void main(String[] args) {

		
		int firstNum = 0;
		int secondNum = 1;
		
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.print(firstNum+" ");
			
			int nextnum = firstNum + secondNum;

			firstNum = secondNum;
			
			secondNum = nextnum;
		}
		
		
	}

}
