package strings.java;

import java.util.*;
public class minimumIndexSumList {

	public static void main(String[] args) {

		String [] str1 = {"Shogun","Tapioca Express","Burger King","KFC"};
		String [] str2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};

		Map<String, Integer> map = new HashMap<>();

		for(int i = 0; i < str1.length; i++) {

			map.put(str1[i], i);
		}

		Map<String, Integer> map2 = new HashMap<>();

		for(int i =0; i < str2.length; i++) {

			if(map.containsKey(str2[i])) {

				map2.put(str2[i], i + map.get(str2[i]));
			}


		}

		int mins = Collections.min(map2.values());

		List<String> lst = new ArrayList<>();

		for(Map.Entry<String, Integer> entry: map2.entrySet()) {

			if(entry.getValue() == mins) {

				lst.add(entry.getKey());
			}



		}

		String [] s = new String [lst.size()];

		for(int i=0; i< s.length; i++) {

			s[i] = lst.get(i);

		}
		System.out.println(Arrays.toString(s));

	}

}
