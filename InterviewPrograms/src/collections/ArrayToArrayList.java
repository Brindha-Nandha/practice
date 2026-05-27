package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		int[] arr=new int[4];
		int[] arr2 = {4,7,2,5};
	
		//converts array to arraylist
		List<Integer> list = new ArrayList<>();
		for(int i =0; i<arr2.length;i++) {
			list.add(arr2[i]);
		}
		System.out.println(list);
		
		//converts arraylist to array
		
		for(int i =0; i<=list.size()-1;i++) {
			arr[i]=list.get(i);
			System.out.print(arr[i] + " ");
		}
		
		
	}

}
