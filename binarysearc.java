package codebat1;

import java.util.Scanner;

public class binarysearc {
	
	public static void main(String args[]) 
	{
	  System.out.println("enter number of elements for one array") ; 
	  Scanner s = new Scanner (System.in ) ; 
	  int n  = s.nextInt();
	   int [] one = new int[n]; 
	  System.out.println("Enter the elements array " ); 
   	   for(int i = 0 ; i < n ; i ++)
     	{
   	     	one[i] = s.nextInt(); 
   	    }
   	           System.out.println("enter number to search in array") ; 
	       int search = s.nextInt(); 
	       
	       Binary(one , search ); 
	}
	
	public static void Binary (int[] one , int search) 
	{
		int start = 0 ; 
		int end = one.length-1; 
		int mid = one.length / 2 ; 
		int flag = 0; 
		
		if(one[mid]==search )
		{
			System.out.println("  found ");
		    flag = 1;
		}
		if (search<one[ mid] )
		{
			end=mid-1;
		}
		if(search>= one[mid])
		{
			start = mid+1 ; 
		}
		if(flag==0)
		{
			
			System.out.println("not found " ) ; 
		}
	}

}