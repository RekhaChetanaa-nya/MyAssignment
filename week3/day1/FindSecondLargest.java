package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> n=new TreeSet<Integer>();
		for(int i=0;i<data.length;i++)
		{
			n.add(data[i]);
		}
		System.out.println(n);
		
		 List<Integer> arr = new ArrayList<Integer>(n);
	    
	     System.out.println(arr.get(arr.size()-2));
	}

}
