package string;

public class CountNoOfWords {

	public static void main(String[] args) {

		String string1 = "count the no of words in string";
		String[] arr = string1.split(" ");
		int c = 0;
		for (String s : arr) {
			c++;

		}
		System.out.println("total no words are :" + c);
	}

}
