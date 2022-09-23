package week3.day2;

import java.util.Map;
import java.util.TreeMap;

public class NoOfOccurances {

	public static void main(String[] args) {

//create input		
		Integer[] input= {2,3,5,6,3,2,1,4,2,1,6,-1};
//declare map 
		Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
//iterate the input array to load the map
		for (Integer integer : input) {
//check if the input value exists in map and load the map accordingly			
			if(map.containsKey(integer))
			{
			map.put(integer, map.get(integer)+1);
			}

			else {
				map.put(integer, 1);
			}
		}
//print the map		
		System.out.println(map);
		
	}

}
