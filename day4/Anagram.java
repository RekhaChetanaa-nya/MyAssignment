package week1.day4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String text1 = "stops";
			String text2 = "potss"; 
			if(text1.length()==text2.length())
			{
				char[] cs1 = text1.toCharArray();
				char[] cs2 = text2.toCharArray();
				Arrays.sort(cs1);	
				Arrays.sort(cs2);		
					System.out.print("After sorting first array----");
					System.out.println(cs1);
					System.out.print("After sorting second array----");
					System.out.println(cs2);				
					cs1.equals(cs2);
					System.out.println("Both strings has same value");
			}
	}
}
