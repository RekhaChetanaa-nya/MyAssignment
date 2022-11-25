package week1.day4;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		int count=0;
		char[] ch=str.toCharArray();
		int s=str.length();
		for(int i=0;i<s;i++)
		{
			if(ch[i]=='c')
				count++;
				
		
		}
	System.out.println("The required character occurred "+count+" times");
	}

}
