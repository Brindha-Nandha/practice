package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterateoverArrayList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(56);
		list.add(78);
		list.add(38);
		System.out.println(list);
		for (int i=0;i<=list.size()-1;i++) {
//			System.out.println(list.get(i));
		}
		for (Integer n:list) {
	//		System.out.println(n);
		}
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());	
		}
		
		
	
	}

}
