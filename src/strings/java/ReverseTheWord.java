package strings.java;

public class ReverseTheWord {

	public static void main(String[] args) {

		String str = "logesh";

		String emp = "";

		for(int i = str.length()-1; i >=0; i--) {

			emp = emp + str.charAt(i);
		}

		System.out.println(emp);

	}

}
