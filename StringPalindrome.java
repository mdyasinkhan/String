package string;

import java.util.Scanner;

public class StringPalindrome {

	public boolean check(String s) {

		int start = 0;
		int end = s.length() - 1;
		while (start < end) {
			if (s.charAt(start) == s.charAt(end)) {
				start++;
				end--;
				return true;

			}
		}
		return false;

	}

	public static void main(String[] args) {
		StringPalindrome s = new StringPalindrome();
		String str = "NOn";
		if (s.check(str)) {
			System.out.print("Yes");

		} else

			// Not a palindrome
			System.out.print("No");
	}
}

/*
 * Scanner sc = new Scanner(System.in); String A = sc.next(); Enter your code
 * here. Print output to STDOUT. char[] s1 = A.toCharArray(); char[] temp = new
 * char[s1.length]; int j = 0; for (int i = s1.length - 1; i >= 0; i--) {
 * 
 * temp[j] = s1[i]; j++;
 * 
 * } String ss = s1.toString(); String sss = temp.toString();
 * 
 * for (int i = 1; i < ss.length(); i++) { for (int k = 1; k < sss.length();
 * k++) { if (ss.charAt(i) == sss.charAt(k)) { System.out.println("Yes"); } } }
 * }
 */
