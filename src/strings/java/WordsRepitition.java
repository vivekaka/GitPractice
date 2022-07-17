package strings.java;

import java.util.*;
public class WordsRepitition {

	public static void main(String[] args) {

		String str = "The brown fox lives by the river";

		String s = str.toLowerCase();

		String [] split = s.split(" ");

		Map<String, Integer> map = new HashMap<>();

		for(String st : split) {

			if(map.containsKey(st)) {

				map.put(st, map.get(st)+1);
			}

			else {

				map.put(st, 1);
			}

		}

		for(Map.Entry<String, Integer> entry : map.entrySet()){

			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}

	}

}
