package practice;

public class Multiples1
{

	//public static void main(String[] args) 
	public int main(int number) 
	{
		int sum = 0;
		for(int i = 0 ; i < 100; i++) 
		{ 
		  //check the number is divisible by 3 or 5
	      //if(i % 3 == 0 || i % 5 == 0 ) 
			if(i % 3 == 0 && i % 5 == 0 ) 
	       {
	    	  System.out.println(i);
	    	  sum = sum+i;
	    	  
	    	//print the number if it is divisible by 3 or 5
	    	  System.out.println(sum); 
	       }
	    
		}
		//System.out.println(i); 
		return sum;

	}

}
