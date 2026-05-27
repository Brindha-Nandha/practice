package arrays;

public class ReverseElementsOfArray {

	public static void main(String[] args) {
		String[] str = new String[3];
		str[0]="All";
		str[1] = "is";
		str[2] = "well";
		for(int i=str.length-1;i>=0;i--) {
			System.out.println(str[i]);
		}
	}

}
