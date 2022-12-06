package week3.day1;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesString {

	public static void main(String[] args) {
		String s="PayPal";
		char[] charArray = s.toCharArray();
		Set<Character> charSet=new HashSet<Character>();
		Set<Character> dupCharSet=new HashSet<Character>();
		for(Character ch:charArray) {
			charSet.add(ch);
		}
		for(Character ch1:charSet)
		{
			dupCharSet.add(ch1);
		}
		 for(int i = 0; i < charSet.size(); i++) {  
		        for(int j = 0; j < dupCharSet.size(); j++) {  
		            if(charArray[i] == charArray[j])  
		            {
		            	charSet.remove(charArray[i]);
		            }    
		        } 
		    }  
		System.out.println("After removing duplicates are---");
		System.out.println(charSet);
		
	}

}
