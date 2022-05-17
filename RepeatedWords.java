package string;

import java.util.HashMap;

public class RepeatedWords {

	public static void main(String[] args) {

		String s = "remove the the repeated word word";
		String[] string = s.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 1; i < string.length; i++) {
			if (map.containsKey(string[i])) {
				map.put(string[i], map.get(string[i]) + 1);
			} else {
				map.put(string[i], 1);
			}

		}
		for (int i = 1; i < string.length; i++) {
			if (map.containsKey(string[i]) && map.get(string[i])>1) {
				map.remove(string[i]);
			}
		}
		map.forEach((Character, Integer) -> System.out.println(" key :" + Character + ", Value :" + Integer));
	}

}
