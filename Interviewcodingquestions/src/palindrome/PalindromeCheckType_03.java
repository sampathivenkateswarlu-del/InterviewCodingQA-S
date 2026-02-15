package palindrome;

import java.util.Scanner;

public class PalindromeCheckType_03 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str=s.nextLine();
		String strname=str.toLowerCase();
		boolean ispalindrome=false;
		int left=0;
		int right=strname.length()-1;
		while(left<right) {
			if(strname.charAt(left)==strname.charAt(right)) {
				ispalindrome=true;
				break;
			}
			left++;
			right--;
			
		}
		
		if(ispalindrome) {
			System.out.println(strname+" : It is palindrome");
		}else {
			System.out.println(strname+" : It is not palindrome");
		}
		s.close();
	}

}
