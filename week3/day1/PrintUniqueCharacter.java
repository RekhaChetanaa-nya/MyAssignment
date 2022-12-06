package week3.day1;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String s="babu";
		char[] charArray = s.toCharArray();
		Set<Character> word=new HashSet<Character>();
		
		//for each
		for(Character c:charArray)
		{
			word.add(c);
		}
		
		//After removing the duplicate letter
		 for(int i = 0; i < word.size(); i++) {  
		        for(int j = i + 1; j < word.size(); j++) {  
		            if(charArray[i] == charArray[j])  
		            {
		            	word.remove(charArray[i]);
		            }    
		        } 
		    }  
		 System.out.println("After removing the duplicate letter");
		System.out.println(word);
	}

}
