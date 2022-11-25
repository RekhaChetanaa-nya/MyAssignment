package week1.day4;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] split=test.split(" ");
		for(int i=0;i<split.length;i++)
		{
			 if((split[i].length())%2!=0)
			{
				 String odd=split[i];
			}
		}		
			 for(int i=0;i<split.length;i++)
				 if((split[i].length())%2==0)
			 {
					 String even=split[i];
				 for(int j=even.length();j>0;j--) 
				 {
					System.out.print(even.charAt(j-1)+" ");
				 }
			}
	}
}

