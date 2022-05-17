package string;

import java.util.HashMap;
import java.util.Scanner;

public class AllUniqueChar {

	public static void main(String[] args) {

		/*
		 * String s = "uniqe"; char[] ch = s.toCharArray(); HashMap<Character, Integer>
		 * map = new HashMap<Character, Integer>(); for (int i = 0; i < ch.length; i++)
		 * { if (map.containsKey(ch[i])) { map.put(ch[i], map.get(ch[i]) + 1); } else {
		 * map.put(ch[i], 1); } } map.forEach((Character, Integer) ->
		 * System.out.println(" key :" + Character + ", Value :" + Integer)); }
		 */
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		char[] s1 = A.toCharArray();
		char[] temp = new char[s1.length];
		int j = 0;
		for (int i = s1.length - 1; i >= 0; i--) {

			temp[j] = s1[i];
			j++;

		}
		String ss = s1.toString();
		String sss = temp.toString();
		
		for (int i = 1; i < ss.length(); i++) {
			for (int k = 1; k < sss.length(); k++) {
				if (ss.charAt(i) == sss.charAt(k)) {
					System.out.println("Yes");
				}
			}
		}
	}
}
