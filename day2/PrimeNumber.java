package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=14;
     int temp=0;
     for(int i=2;i<=n/2;i++)
    	 
     {
    	 if(n%i==0) 
    	 {
    		temp++;
    	 }	
     }
    	  if(temp>1)
    		 System.out.println("not prime");
    	 else
    		 System.out.println("prime");
    	 
     }
}