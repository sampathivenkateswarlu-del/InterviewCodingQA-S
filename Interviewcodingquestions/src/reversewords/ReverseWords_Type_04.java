package reversewords;

import java.util.Scanner;

public class ReverseWords_Type_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentense : ");
		String s = sc.nextLine();

		String[] words = s.split(" ");
		StringBuilder result = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			result.append(words[i]).append(" ");
		}
		System.out.println(result.toString().trim());
		sc.close();
	}

}
