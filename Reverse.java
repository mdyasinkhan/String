package string;

public class Reverse {

	public static void main(String[] args) {

		String str = "Reverse";

		char[] arr = str.toCharArray();

		int size = arr.length;

		char[] temp = new char[size];
		int j = 0;
		for (int i = size - 1; i >= 0; i--) {
			temp[j] = arr[i];
			j++;
		}
		System.out.println(temp);

	}
	/*
	 * public static void main(String[] args) { String word =
	 * "split this sentence and reverse also"; String[] newword = word.split(" ");
	 * for (String w : newword) { char[] arr = w.toCharArray(); int j = 0; char[]
	 * temp = new char[arr.length]; for (int i = arr.length - 1; i >= 0; i--) {
	 * temp[j] = arr[i]; j++; } System.out.println(temp); } }
	 */

}
