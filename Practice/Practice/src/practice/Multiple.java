package practice;



/**
 * return an array of multiples of 5 between 0 and 100
 * @author tet19171871
 *
 */
public class Multiple
{
	public static void multiplesOfFive(int number)
	{
		//int index;
//        for (index = 0; index <= 100; index++) 
//        {
//        	//checks if the remainder is 0 after dividing the index by 5
//            if (index % 3 == 0 && index % 5 == 0) 
//            {
//            	//prints the value after dividing the index value by 5
//                System.out.println(index);
//                		
//            }
//	
//		}
//        System.out.println(index);
//        return index;
//	}
	
		for(int i = 0 ; i < 100; i++) //Loop from 0 to 100
		{ 
	      if(i % 3 == 0 || i % 5 == 0 ) //check the number is divisible by 3 or 5
	       {
	    	  System.out.println(i); //print the number if it is divisible by 3 or 5
	       }
		}
	
	
	}
}

