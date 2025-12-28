package codingQsInLoops;

import java.util.Scanner;

public class PrimeNumber_type2 {
	
	public static boolean isprime(int n) {
		boolean status=true;
		if(n==0 | n==1) {
			status=false;
		}
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				status =false;
				break;
			}
		}
		return status;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the up to number : ");
		int uptonum=sc.nextInt();
		
		for(int i=1;i<=uptonum;i++) {
			if(isprime(i)) {
				System.out.print(i+" ");
			}
			
		}
		sc.close();
	}

}
