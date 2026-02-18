package reversewords;

import java.util.Scanner;

public class ReverseWords_Type_03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a sentense : ");
		String s=sc.nextLine();
		String[] words=s.split(" ");
		
		for(int i=words.length-1;i>=0;i--) {
			System.out.print(words[i]+" ");
		}
		sc.close();
	}

}
