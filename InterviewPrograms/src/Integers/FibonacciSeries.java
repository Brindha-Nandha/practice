package Integers;
/*
 * 0 1 1 2 3 5 8 13 
 */
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n");
		int n = sc.nextInt();
		int n1=0,n2=1;
		System.out.println("The Fibonacci series are: ");
		for (int i=0; i <=n;i++) {
			System.out.print(" " +n1);
			int n3 = n1 + n2;
			n1 =n2;
			n2 = n3;
		}
		
	}

}
