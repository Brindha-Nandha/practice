package stringpackage;

import java.util.ArrayList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String s = "aaaaabbbbcccdddawe";
		ArrayList<Character> list = new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			if(!list.contains(s.charAt(i))) {
			list.add(s.charAt(i));
		}}
		System.out.println(list);
		String news="";
		for(int i =0;i<list.size();i++) {
			news=news+list.get(i);
		}
		System.out.println(news);
	}

}
