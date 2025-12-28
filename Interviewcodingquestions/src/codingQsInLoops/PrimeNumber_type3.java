package codingQsInLoops;

import java.util.Scanner;

public class PrimeNumber_type3 {
	
	public static boolean isPrime(int n) {
		boolean status=true;
		if(n==1 | n==0) {
			status = false;
		}
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				status=false;
				break;
			}
		}
		return status;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("Enter a  number : ");	
			int num=sc.nextInt();
			if(isPrime(num)) {
				System.out.println(num+" : It is prime number");
			}else {
				System.out.println(num+" : It is not prime number");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
