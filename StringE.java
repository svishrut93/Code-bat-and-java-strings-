
//Return true if the given string contains between 1 and 3 'e' chars.


package codebat1;

import java.util.Scanner;
import java.util.*;
public class StringE {
	
	
	
	public static void main(String args[])
	{
		
		Scanner s= new Scanner (System.in);
		System.out.println("Enter the string ");
		String str ; 
		str = s.next();
		System.out.println("The ans is :"+ Compute(str));
	}

	public static boolean Compute(String str)
	{
		int count =0 ; 
		
		for(int i=0;i < str.length();i++)
		{
			if( (str.charAt(i)=='e') || (str.charAt(i)=='E') )
			{
				count++;
			}
		}
		
	   if(count>=1 && count <=3 )

	   {
		   return true ;
	   }
	   else
	   {
		return   false ;
	   }
	}
}
