package Integers;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		int sum=0,oddsum =0;
		for(int i=1;i<=5;i++) {
			if(i%2==0) {
				sum = sum+i;
			}
		}
		System.out.println("The sum of even numbers are : "+ sum);
	
	
	for(int i=1;i<=5;i++) {
		if(i%2!=0) {
			oddsum = oddsum+i;
		}
	}
	System.out.println("The sum of odd numbers are : "+ oddsum);

}}

