package palindrome;

public class PalindromeCheckType_04 {

	public static void main(String[] args) {
		String str="madam";
		
		String rev= new StringBuilder(str).reverse().toString();
		
		if(str.equals(rev)) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("It is not palindrome");
		}

	}

}
