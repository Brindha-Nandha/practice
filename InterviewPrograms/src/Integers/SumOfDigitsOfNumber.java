package Integers;

import java.util.Scanner;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int a =0,sum=0;
		while(n>0) {
			a = n%10;
			n=n/10;
			sum = sum +a;
		}
		System.out.println("The sume of digits of number" + sum);
	}

}
