package string;

public class NoOfCharInStringAndVowel {

	public static void main(String[] args) {
		
		String s = "charactercount";
		char[] ch= s.toCharArray();
		int count=0;
		for(int i =0 ; i<ch.length;i++) {
			count++;
		}
		int vowelcount=0;
		for(char c :ch) {
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				vowelcount++;
			}
		}
		System.out.println(vowelcount);
		System.out.println(count);
	}

}
