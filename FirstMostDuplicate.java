package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstMostDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Psuedocode
		 * input: abbaba
	 * output: b
		 * 1) Map -> HashMap 
		 * 2) String -> ch[] -> Get all the character -> occurance
		 * 3) Keep comparing the occurance with other values -> max value -> character
		 * 
		 */
		
//find first most duplicate
		String str="abbaba";
		char[] array=str.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		int maxvalue=0;
		char maxkey=0;
		for (int i = 0; i < array.length; i++) {
			map.put(array[i],map.getOrDefault((array[i]),0)+1 );
		
			if (map.get(array[i])>maxvalue)
			{
				maxkey=array[i];
				maxvalue=map.get(array[i]);
			}
			
		}
		
		System.out.println("The first most duplicate " +maxkey +"---" +maxvalue);
		
/*//to find occurence using map
		String str="abbaba";
		char[] array=str.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for (char c : array) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
				
			}
			else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		
//to  find most duplicate number = maximum occurence
		int maxvalue=0;
		char maxkeychar=0;
		Set<Entry<Character,Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			if(entry.getValue()>maxvalue) {
				maxvalue=entry.getValue();
				maxkeychar=entry.getKey();			
				}
			}
		System.out.println(maxkeychar +"--" +maxvalue);
	*/	
		}

}
