package codebat1;

import java.util.Scanner;


public class xclose10 {

	public static void main(String args[])
	{
		
		Scanner s= new Scanner (System.in);
		System.out.println("Enter the numbers ");
		int num1; 
	    num1=s.nextInt();
	    int num2; 
	    num2=s.nextInt();
	    System.out.println(Compute(num1,num2));
	    
	}
	    
	    
	    
	    public static int Compute (int num1 , int num2 )
	    {
	    
	    if(Math.abs(10-num1)<Math.abs(10-num2))
	    {
	    	return num1;
	    }
	    else if (Math.abs(10-num1)==Math.abs(10-num2))
	    {
	    	return 0 ; 
	    }
	    else
	    	return num2 ; 
	    }
	
	
}
