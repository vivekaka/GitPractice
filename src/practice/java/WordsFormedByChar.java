package practice.java;

import java.util.*;
public class WordsFormedByChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"cat","bt","hat","tree"};

		String chars = "atach";

		Map<Character, Integer> map1 = new HashMap<>();
		int ans = 0;

		for(int i=0; i< chars.length(); i++){

			char ch = chars.charAt(i);

			map1.put(ch, map1.getOrDefault(ch,0)+1);
		}



		for(String s: words){
			
			Map<Character, Integer> map2 = new HashMap<>();

			for(int i=0; i<s.length(); i++){

				char ch = s.charAt(i);

				map2.put(ch, map2.getOrDefault(ch,0)+1);

			}

			int check=0;

			for(int j=0; j < s.length(); j++){

				char ch = s.charAt(j);

				if(map1.containsKey(ch)){

					if(map1.get(ch) >= map2.get(ch)){

						check++;
					}
				}
			}

			if(check == s.length()){

				ans = ans + check;
			}

		}

		System.out.println(ans); 
	}

}
