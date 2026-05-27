package collections;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		list.add(23);
		list.add(67);
		list.add(45);
		list.add(12);
		list.add(67);
		
		System.out.println(list);
		for(int i = list.size()-1;i>=0;i--) {
			list2.add(list.get(i));
		}
		System.out.println(list2);
		
		System.out.println(list2.contains(67));
		
		for (Integer num: list2) {
			
			if(num==12) {
				System.out.println("True");
			}
			
			
		}
	}

}
