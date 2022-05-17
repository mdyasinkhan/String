package string;

import java.util.HashMap;

public class Occurrence {

	public static void main(String[] args) {

		String str = "occurrence";

		char[] ch = str.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i]) + 1);
			} else {
				map.put(ch[i], 1);
			}
		}
		map.forEach((Character, Integer) -> System.out.println(" key :" + Character + ", Value :" + Integer));
	}

}
