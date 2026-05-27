package Integers;
/*
 * prime numbers are greater than 1 
 * 2 is the only even prime number
 * numbers divisible by 1 and its own are prime numbers
 */
public class PrimeNumber {

	public static void main(String[] args) {
		
		int n = 5;
		boolean prime = true;
		if(n<2) {
			System.out.println(n + " Not a prime number");
		}
		else if(n==2) {
			System.out.println(n + " Prime number");
		}
		else {
		for (int i=2; i<=n/2; i++) {
			if (n%i==0)
			{
				System.out.println(n + " Not a prime number");
				prime = false;
				break;
			}
		}
		if (prime == true) {
			System.out.println(n + " Prime number ");
		}
		
		}
	}

}
