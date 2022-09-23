package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupsCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
//Use the declared String text as input
		String Text="We learn java basics as part of java sessions in java week1";	
//Split the String into array and iterate over it 
        String[ ] split=Text.split(" ");
//Declare a set and add the array elements in order to remove duplicates
        Set<String> coll=new LinkedHashSet<String>();

        for (String string : split) {
			coll.add(string);	
         }
		
		System.out.println(coll);
	}
}
	