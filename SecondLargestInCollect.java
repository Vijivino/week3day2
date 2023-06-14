package week3.day2.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestInCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */
		
		int[] data = {3,2,11,4,6,7};

		List<Integer> values=new ArrayList<Integer>();
		for (Integer integer : data) {
			values.add(integer);
		}
	    Collections.sort(values);
		System.out.println(values);
        System.out.println(values.get(values.size()-2));
		
		}

}
