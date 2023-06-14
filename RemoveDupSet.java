package week3.day2.Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare a String as PayPal India

//		Convert it into a character array

//		Declare a Set as charSet for Character

//		Iterate character array and add it into charSet

//              Check whether the character is space, if not add to charSet 

//		Iterate using charSet

//		print each character for charSet
		
		String input="PayPal India";
		char[] charArray = input.toCharArray();
		
		Set<Character> set =new LinkedHashSet <Character> ();
		for (Character c : charArray) {
			set.add(c);
			
		}
		 	
		System.out.println(set);
//		for (Character character : set) {
//			
//			System.out.println(character);
//		}

	}

}
