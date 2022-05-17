package string;

public class RemoveAllWhiteSpace {

	public static void main(String[] args) {

		String string1 = "Remove all the white space in string";
		char[] arr = string1.toCharArray();
		char[] arr2 = new char[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ') {
				arr2[i] = arr[i];
				System.out.print(arr2[i]);
			}
		}

	}

}
