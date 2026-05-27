package Integers;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n = 153;
		int temp = n;
		int count = 1;
		int multi = 1,sum=1;
		while(n/10>0) {
			n=n/10;
			count++;
		}
		System.out.println(temp+ " is a "+ count + " digit number.");
		while(temp/10>0) {
			temp = temp/10;
			for(int i = 1; i<count;i++) {
				multi=temp*temp;
			}
			sum=sum+multi;
		}
		System.out.println(sum);
	}

}
