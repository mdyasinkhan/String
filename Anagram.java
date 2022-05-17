package string;

import java.util.HashMap;

// If two strings contain same set of characters but in different order then the two strings are called anagram.
public class Anagram {

	public static void main(String[] args) {

		String s1 = "now";
		String s2 = "won";
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		
		for(int i =0; i<c1.length;i++) {
			if(map1.containsKey(c1[i])) {
				map1.put(c1[i], map1.get(c1[i])+1);
			}
			else {
				map1.put(c1[i], 1);
			}
		}
		//map1.forEach((Character, Integer) -> System.out.println(" key :" + Character + ", Value :" + Integer));
		
		for(int k =0; k<c2.length;k++) {
			if(map1.containsKey(c2[k])) {
				map1.put(c2[k], map1.get(c2[k])-1);
			}
		else if(map1.containsKey(c2[k]) && map1.get(c2[k])==1) {
				map1.remove(c2);
			}
		}
		map1.forEach((Character, Integer) -> System.out.println(" key :" + Character + ", Value :" + Integer));
		if(map1.size()==0) {
		System.out.println("true");
		}

	}

}
