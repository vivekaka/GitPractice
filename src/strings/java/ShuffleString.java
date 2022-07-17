package strings.java;

public class ShuffleString {

	public static void main(String[] args) {

		String str = "codeleet";

		int[] arr = {4,5,6,7,0,2,1,3};

		char [] ch = new char[arr.length];

		for(int i=0; i < arr.length; i++ ) {

			ch[arr[i]] = str.charAt(i);

		}

		System.out.println(ch);

	}

}
