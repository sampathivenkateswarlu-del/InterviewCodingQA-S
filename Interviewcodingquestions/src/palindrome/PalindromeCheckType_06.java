package palindrome;

import java.util.Scanner;

public class PalindromeCheckType_06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str=sc.nextLine();
		
		str=str.toLowerCase();
		String rev=new StringBuilder(str).reverse().toString();
		
		if(str.equals(rev)) {
			System.out.println(str+" : It is palindrome");
		}else {
			System.out.println(str+" : It is not palindrome");
		}
		
		sc.close();
	}

}
