package reversewords;

public class ReverseWords_Type_01 {

	public static void main(String[] args) {
		String s="I love java";
		String[] words=s.split(" ");
		for(int i=words.length-1;i>=0;i--) {
			System.out.print(words[i]+" ");
		}

	}

}
