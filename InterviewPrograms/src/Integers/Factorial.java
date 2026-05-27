package Integers;

public class Factorial {

	public static void main(String[] args) {
		int n = 5;
		int fact = 1;
		System.out.print("Factorial of " + n + " is : ");
		for(int i = n; i>=1;i--) {
			fact = fact*i;
			System.out.print(i+" * ");
		}
		System.out.print(" : " + fact);
	}

}
