package string;

import java.util.HashMap;
import java.util.Map.Entry;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {

		String s = "ssttrringg";
		char[] arr = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		for (Entry<Character, Integer> entry : map.entrySet()) {
			{
				if (entry.getValue() == 1) {
					System.out.println(entry.getKey());
				}

			}
		}
	}
}
