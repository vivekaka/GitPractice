package strings.java;

import java.util.Arrays;

public class RemoveSpecialCharacterAndAddNumbers {

	public static void main(String[] args) {

		String str = "!23&^(234##539!#";

		String emp ="";

		int sum = 0;

		String[] newStr = str.replaceAll("[^0-9]", " ").split(" ");

		System.out.println(Arrays.toString(newStr));

		for (int i = 0; i < newStr.length; i++) {

			String s = newStr[i];

			char[] ch = s.toCharArray();

			int len = ch.length;

			if(len >=3) {

				String ns = String.valueOf(ch);

				int psInt = Integer.parseInt(ns);

				System.out.println(psInt);

				while (psInt != 0 ) {

					sum = sum + psInt%10;

					psInt = psInt/10;

				}

				System.out.println(sum);
				sum = 0;
			}


		}

	}

}


