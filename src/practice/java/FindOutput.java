package practice.java;

import java.util.Iterator;

public class FindOutput {
	
	public static void main(String[] args) {
		
		
		String str = "pepul";
		
		char [] ch = str.toCharArray();
		
		String rev = "";
		
		for (int i = str.length()-1; i >=0; i--) {
			
			rev = rev + ch[i];
			
		}
		
		System.out.println(rev);
	}
		
	}


