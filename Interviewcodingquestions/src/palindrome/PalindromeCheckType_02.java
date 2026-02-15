package palindrome;

public class PalindromeCheckType_02 {

	public static void main(String[] args) {
		String str="madam";
		
		boolean ispalindrome =false;
		
		int left=0;
		int right=str.length()-1;
		
		while(left<right) {
			if(str.charAt(left)==str.charAt(right)) {
				ispalindrome=true;
				break;
			}
			left++;
			right--;
		}
		
		if(ispalindrome) {
			System.out.println("It is palidrome");
		}else {
			System.out.println("It is not palindrome");
		}
	}

}
