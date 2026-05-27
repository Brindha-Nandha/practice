package stringpackage;

public class ReverseEachWord {

	public static void main(String[] args) {
		String s = "This is an example";
		String[] split = s.split(" ");
		
		for (int i=0;i<split.length;i++) {
			String reverse ="";
			for (int j = split[i].length()-1;j>=0;j--) {
				reverse = reverse + split[i].charAt(j);
			}
			System.out.print(reverse + " ");
			
		}
	}

}
