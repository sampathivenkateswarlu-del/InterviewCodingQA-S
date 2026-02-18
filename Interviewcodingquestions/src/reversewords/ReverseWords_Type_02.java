package reversewords;

public class ReverseWords_Type_02 {

	public static void main(String[] args) {
		String s="I love java";
		String[] words =s.split(" ");
		
		StringBuilder result=new StringBuilder();
		
		for(int i=words.length-1;i>=0;i--) {
			result.append(words[i]).append(" ");
		}
		
		System.out.println(result.toString().trim());
	}

}
