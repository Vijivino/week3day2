package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersecCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// a) Declare a list from array for {3,2,11,4,6,7};	 
	    Integer[] array1= {3,2,11,4,6,7};
		List<Integer> values=new ArrayList<Integer>();
        for (Integer integer : array1) {
				values.add(integer);
		}
//b) Declare another list from array for {1,2,8,4,9,7};
	    Integer[] array2= {1,2,8,4,9,7};
		List<Integer> values2=new ArrayList<Integer>();
		for (Integer integer : array2) {
			values2.add(integer);
		}
		
	    System.out.println(values);
	    System.out.println(values2);
// e) Compare Both the lists using a condition statement
		for (Integer i : values) {
			for (Integer i2 : values2) {
	

				if (values.get(i)==values2.get(i2) )
				{
				System.out.println(values2.get(i2)); 
					}
			}
		}
}
}
	
