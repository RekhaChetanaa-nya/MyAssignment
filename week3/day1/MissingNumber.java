package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[] data = {3,2,1,8,9,10,4,6,7,2,3,3,6,7};
		System.out.println("The given data are");
		System.out.println("3,2,1,8,9,10,4,6,7,2,3,3,6,7");
		Set<Integer> n=new TreeSet<Integer>();
		for(int i=0;i<data.length;i++)
		{
			n.add(data[i]);
		}
		System.out.println("The numbers after sorting and removing duplicates are");
		System.out.println(n);
		List<Integer> arr = new ArrayList<Integer>(n);
		for(int i=1;i<arr.size();i++)	
		{
			int s=arr.get(i);
			int Missingnum=s-1;
			//
			if(arr.get(i-1)!=Missingnum)
			{
			System.out.println("The missing number is");
			System.out.println(Missingnum);
			}			
		}	
	}
}
