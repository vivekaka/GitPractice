package practice.java;

public class StringShuffle {

	public static void main(String[] args) {

		String str = "phonecell";
		
		int [] arr = {4, 5, 6, 7, 8, 0, 1, 2, 3};
		
		char [] ch = new char [arr.length];
		
		
		for(int i=0; i< arr.length; i++) {
			
			ch[arr[i]] = str.charAt(i);
		}
		
		System.out.println(ch);
		
	}

}
