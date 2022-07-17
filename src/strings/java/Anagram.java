package strings.java;

import java.util.*;
public class Anagram {

	public static void main(String[] args) {

		String s = "anagram";
		String t = "gramana";

		boolean isAnagram = false;

		if(s.length() != t.length()){

			isAnagram = false;
		}


		char[] ch1 =  s.toCharArray();
		char[] ch2 =  t.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);


		isAnagram = Arrays.equals(ch1, ch2);
		if(isAnagram) {

			System.out.println("True");
		}
		else {

			System.out.println("False");
		}
	}

}


