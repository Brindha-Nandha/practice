package stringpackage;

public class StringReverse {
	
	/*reversing using existing method   
	**remember reverse not available in String Class	
	*/
	void defaultMethod(StringBuffer s) {
		System.out.println(s.reverse());
	}
	
	/*Using Append method in SB	 */
	void usingAppend(StringBuffer s) {
		StringBuffer reverse =new StringBuffer();
		for (int i=s.length()-1; i>=0;i--) {
			reverse.append(s.charAt(i));
		}
		System.out.println(reverse);
	}
	
	//using for loop and charAt()
	void usingFor(String s) {
		String result = "";
		for (int i=s.length()-1;i>=0;i--) {
			result += s.charAt(i);
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Hello world");
		s1.append(" example");
		StringReverse sr = new StringReverse();
		sr.defaultMethod(s1);
		StringBuffer s2 = new StringBuffer("All is well");
		sr.usingAppend(s2);
		String s3 = "God is great";
		sr.usingFor(s3);
	}

}
