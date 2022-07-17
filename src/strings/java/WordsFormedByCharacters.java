package strings.java;

import java.util.*;

public class WordsFormedByCharacters {

	public static void main (String[] args) {


		String[] words = {"cat","bt","hat","tree"};

		String chars = "atach";


		Map<Character,Integer>h1=new HashMap<>();
		int ans=0;

		for(int i=0;i<chars.length();i++){
			char ch=chars.charAt(i);
			h1.put(ch,h1.getOrDefault(ch,0)+1);

		}

		for(String i:words){
			Map<Character,Integer>h2=new HashMap<>();
			for(int j=0;j<i.length();j++){
				char ch=i.charAt(j);
				h2.put(ch,h2.getOrDefault(ch,0)+1);
			}
			int check=0;
			for(int j=0;j<i.length();j++){
				char ch=i.charAt(j);
				if(h1.containsKey(ch)){
					if(h1.get(ch)>=h2.get(ch)){
						check++;
					}
				}
			}
			if(check==i.length()){
				ans+=check;
			}
		}
		System.out.println(ans);	

	}

}
