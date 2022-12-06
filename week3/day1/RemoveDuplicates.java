package week3.day1;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		Set<String> word=new TreeSet<String>();
		
		String[] strArray = null;  
		//converting using String.split() method with whitespace as a delimiter  
		strArray = text.split(" ");  
		//printing the converted string array  
//		for (int i = 0; i< strArray.length; i++)
//		{  
//		System.out.println(strArray[i]);  
//		}  
		
		for(int i=0;i<strArray.length;i++)
		{
			word.add(strArray[i]);
		}
		System.out.println(word);
	}
}
