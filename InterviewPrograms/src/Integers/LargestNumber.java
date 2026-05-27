package Integers;

public class LargestNumber {

	public int largestTwo(int a, int b) {
		if (a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	public int largetThree(int a, int b,int c) {
		if((a>b)&&(a>c)){
			return a;
		}
		else if(b>c) {
			return b;
		}
		else {return c;}
	}
	public static void main(String[] args) {
		LargestNumber ln = new LargestNumber();
		int result = ln.largestTwo(20, -98);
		System.out.println(result + " is greater");
		result = ln.largetThree(78, 56, -0);
		System.out.println(result + " is greater");
	}

}
