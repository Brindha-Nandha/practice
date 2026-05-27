package Integers;

public class SwapNumbers {
	// swap without using temp variable
	void swap(int a, int b) {
		System.out.println("The numbers are "+ a +" and "+b);
		a=a+b;  
		b=a-b;	
		a=a-b;
		System.out.println("The swapped numbers are "+a +" and "+b);
	}
	
	// swap using temp variable
	void swaptemp(int a, int b) {
		System.out.println("The numbers are "+ a +" and "+b);
		int temp =a;
		a = b;
		b = temp;
		System.out.println("The swapped numbers are "+a +" and "+b);
	}

	public static void main(String[] args) {
		
		SwapNumbers s = new SwapNumbers();
		s.swap(10, 20);
		s.swaptemp(25, 15);	
		
	}

}
