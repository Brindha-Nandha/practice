package collections;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(67);
		list.add(45);
		list.add(12);
		list.add(67);
		System.out.println(list);
		for(int i=0;i<=list.size()-1;i++) {
			for(int j=i+1;j<=list.size()-1;j++) {
				if(list.get(i)==list.get(j)) {
					list.remove(j);
				}
			}
			
		}
		System.out.println(list);
		
	}

}
