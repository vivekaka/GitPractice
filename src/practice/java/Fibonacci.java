package practice.java;

public class Fibonacci {

	public static void main(String[] args) {

		
		int firstNum = 0;
		
		int secondNum = 1;
		
		for(int i=1; i < 10; i++) {
			
			System.out.print(firstNum+" ");
			
			int nextNum = firstNum + secondNum;
			
			firstNum = secondNum;
			secondNum = nextNum;
		}
	}

}
