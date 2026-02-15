package palindrome;

public class PalindromeCheckType_01 {
	public static void main(String[] args) {
		String str="madam";
		
		boolean ispalindrome=true;
		
		int left=0;
		int right=str.length()-1;
		
		while(left<right) {
			if(str.charAt(left) !=str.charAt(right)) {
				ispalindrome=false;
				break;
			}
			left++;
			right--;
		}
		
		if(ispalindrome) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("It is not palindrome");
		}
	}
}
