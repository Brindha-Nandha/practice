package Integers;

import java.util.Scanner;

public class PostiveNegativeZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n==0) {
			System.out.println("Entered a zero");
		}
		else if (n<0) {
			System.out.println(n + " is a negative number");
		}
		else {
			System.out.println(n + " is a positive number");
		}
	}

}
