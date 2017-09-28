package codebat1;

import java.util.Scanner;
import java.util.*;

public class everyNth {
	public static void main(String args[])
	{
		
		Scanner s= new Scanner (System.in);
		System.out.println("Enter the string ");
		String str ; 
		int n ; 
		str = s.next();
		System.out.println("Enter the n value  ");
		n= s.nextInt();
		System.out.println("The ans is :"+ Compute(str,n));
		
	}
	
	
	public static String Compute (String str, int n )
	{
		String etf= ""  ; 
		for(int i = 0 ; i < str.length(); i=i+n )
		{
			etf = etf+str.charAt(i); 
		}
		
		
	System.out.println(str.substring(5));
		
	return etf ; 	
		
	}
}
