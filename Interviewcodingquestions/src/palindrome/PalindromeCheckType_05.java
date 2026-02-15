package palindrome;

public class PalindromeCheckType_05 {

	public static void main(String[] args) {
		String str="Madam";
		str=str.toLowerCase();
		String rev=new StringBuilder(str).reverse().toString();
		
		if(str.equals(rev)) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("It is not palindrome");
		}
	}

}
