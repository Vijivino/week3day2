package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//the input into collections list	
        int[] arr = {1,2,3,4,7,6,8};			
		List<Integer> val=new ArrayList<Integer>();
		for (Integer integer : arr) {
			val.add(integer);
		}
// Sort the list	
		Collections.sort(val);
		System.out.println(val);
// loop through and check if the iterator variable is not equal to the list values respectively
		for (int i=0;i<val.size();i++)	
		{
			if (val.get(i)!=i+1)
			{
				System.out.println("the missing no is "+(i+1));
				break;
			}
		}

	}

}
