package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SizeOfCollection {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(23);
		list.add(67);
		list.add(45);
		list.add(12);
		list.add(67);
		int count=0;
		list.addAll(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			itr.next();
			count++;
		}
		System.out.println(count);
		}

}
