package week3.day1;

import java.util.HashSet;
import java.util.Set;

public class DuplicateRemoval {
public static void main(String[] args) {
	int[] num={3,5,7,2,5,7,9,2,1,54,8,4,6,4,8};
	Set<Integer> n=new HashSet<Integer>();
	for(int i=0;i<num.length;i++)
	{
		n.add(num[i]);
	}
	System.out.println(n);
}
}
