package week3.day1;

public class DupRemovNormal {
	
	public static void main(String[] args) {
		
		String str = "We learn java basics as part of java sessions in java week1";  
		//declaring an empty string array  
		String[] strArray = null;  
		//converting using String.split() method with whitespace as a delimiter  
		strArray = str.split(" ");  
		
		//printing the converted string array  
		for (int i = 0; i<strArray.length; i++)
		{
		for(int j=i+1;j<strArray.length;j++)
		{
			if(strArray[i].equals(strArray[j]))
		  
			{
				{
					strArray[i]=null;
				}
		
		  break;
			}  
		}
		}
		System.out.println("After removing duplicate words.....");
		for(int k=0;k<strArray.length;k++)
		{
			if(strArray[k]!=null)
			{
				
				System.out.println(strArray[k]);
			}
		}
		
	}

}
