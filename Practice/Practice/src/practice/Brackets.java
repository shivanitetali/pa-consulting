package practice;
import java.util.ArrayList;

/**
 * balancedBrackets("[()]")
 * Input: exp = "[()]"
 * Output: Balanced
 * 
 * Input: exp = "{()}"
 * Output: Balanced
 * 
 * Input: exp = "[]{}()"
 * Output: Balanced
 * 
 * Input: exp = "[)[)"
 * Output: Not Balanced
 * 
 * Input: exp = "()]()"
 * Output: Not Balanced
 * 
 * @author tet19171871
 *
 */
	public class Brackets 
	{
		/**
		 * method that returns String Output as 'Balanced' or 'Not Balanced' based on whether equation is true or false
		 * @return
		 */
		
			/**
			 * method to count how many open brackets & how many closed brackets
			 * comparing the their values, 
			 * same value of open = Balanced
			 * @param str input
			 * @return a string, stating balanced or not 
			 */
			 public static String balancedBrackets(String str) {
			 String result = "Not Balanced"; 
			 int openBrackets = 0; 
			 int closedBrackets = 0; 
			 int openCurlies = 0; 
			 int closedCurlies = 0; 
			 int openSquare = 0; 
			 int closedSquare = 0;
			 
			 if (str.length() ==0 || str.length()%2 == 1) {
			  return result;    
			 }
			 else {
			/**
			 * counting how many there are open brackets 
			 */
			   for(int index=0; index < str.length(); index++)
			    
			      {   
			    char character = str.charAt(index); 
			    
			    if(character == '[') {
			       openSquare++;
			  
			      }   if(character == '{') {
			       openCurlies++;
			      }
			       if(str.charAt(index) == '(') {
			       openBrackets++;
			      }
			/**
			 * counting how many there are closed brackets 
			 */
			       if(character == ')') {
			       closedBrackets++;
			      }
			       if(character == '}') {
			       closedCurlies++;
			      }
			       if(character == ']') {
			       closedSquare++;
			      }
			 }
			//comparing open brackets to closed brackets 
			      if((openBrackets == closedBrackets) && 
			        (openCurlies == closedCurlies) && 
			        (openSquare==closedSquare)) 
			      {
			      result = "Balanced";
			           
			}
			}
			 
			 return result;
			}
			}

//	public static String balancedBrackets(String input ) 
//	{
//			
//			String result = "Balanced"; //success message + the default value
//			String fail = "Not Balanced"; //fail message + the default value
//			
//			int openSquare = 0;
//			int closedSquare = 0;
//			int openBrackets = 0;
//			int closedBrackets = 0;
//			int openCurley = 0;
//			int closedCurley = 0;
//			     	
//			        for (int index=0; index < input.length(); index++)
//			        {
//			            switch (input.charAt(index)) 
//			            {
//			            	case '[':	
//			            		openSquare++;
//			            		break;
//			            	case ']':
//			            		closedSquare++;
//			            	case '(':
//			            		openBrackets++;
//			            		break;
//			            	case ')':
//			            		 closedBrackets++;
//			            	case '{':
//			            		 openCurley++;
//			            		 break;
//			            	case '}':
//			            		closedCurley++;
//			            	 default:
//					                break;
//			            		
//			            }
//			        }
//			        if (openSquare == closedSquare && openBrackets == closedBrackets && openCurley == closedCurley )
//			        {
//			            return result;
//			        }
//			        else
//			        {
//			            return fail;
//			        }
//			   }
//		public static void main(String args[]) 
//		{
//		    System.out.println(Brackets.balancedBrackets("()"));
//		}
//	}
		
	

//	public static String balancedBrackets(String str ) 
//	{	
//		String result = "Balanced"; //success message + the default value
//		String fail = "Not Balanced"; //fail message + the default value
//		
//		int openSquare = 0;
//		int closedSquare = 0;
//		int openBrackets = 0;
//		int closedBrackets = 0;
//		int openCurley = 0;
//		int closedCurley = 0;
//		
//	
//		for(int index = 0; index < str.length(); index++)
//		{
//			/**
//			 * checking for the count of the open and closed Square
//			 */
//			if(str.charAt(index) == '[')
//			{
//				openSquare++;
//			}
//				else if(str.charAt(index) == ']')
//				{
//					closedSquare++;
//				}
//			//System.out.println(index);
//			
//			/**
//			 * checking for the count of the open and closed Brackets
//			 */
//			if(str.charAt(index) == '(')
//			{
//				openBrackets++;
//			}
//			else if (str.charAt(index) == ')')
//			{
//				closedBrackets++;
//			}
//			
//						
//			/**
//			 * checking for the count of the open and closed Curley
//			 */
//			if(str.charAt(index) == '{')
//			{
//				openCurley++;
//			}
//			else if (str.charAt(index) == '}')
//			{
//				closedCurley++;
//			}
//			
//			if(openSquare == closedSquare  && openBrackets == closedBrackets && openCurley == closedCurley )
//			{
//				return result;
//			}
//					return fail;
//				
//		}
//		System.out.println(result);
//	
//		return result;
//	}
//}
//
//
////if(str.length() == 0 || str.length() % 2 == 1)
////{
////	return result;
////}
////else
////{
////	return fail;
////}
////
////
///**
// * String split into array of char
// * length of the array
// * checked every index
// * variable to count
// * counted how many open and close brackets
// * if they were equal
// * result balanced
// * 
// *  
// * String builder
// * used other methods to break up the code
// * 
// * 
// * connect index checks inner index 
// * loop through the remainder of string to find corresponding closing parenthesis
// */
//
//
