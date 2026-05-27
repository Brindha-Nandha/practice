package stringpackage;

public class ReverseWords {

	public static void main(String[] args) {
		String s = "This is an example";
		String[] split = s.split(" ");
		String reverse ="";
		for (int i=split.length-1;i>=0;i--) {
			reverse = reverse+split[i] + " ";
	}
		System.out.println(reverse);
	}
	

}
