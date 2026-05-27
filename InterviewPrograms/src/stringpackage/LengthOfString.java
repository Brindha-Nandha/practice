package stringpackage;

public class LengthOfString {

	public static void main(String[] args) {
		String s = "Brindha is a ";
		int count =0;
		for(int i =0; ; i++) {
			try {
				s.charAt(i);
					count++;
			} catch (Exception e) {
				break;
			}
			
			
		}
		System.out.println(count);
	}

}
