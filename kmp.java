package codebat1;

import java.util.Scanner;


//Minimum characters to be added at front to make string palindrome
public class kmp {
	
	public static void main(String args[])
	{
		
		
	System.out.println("Enter the string to check");
	//StringBuffer sb = new StringBuffer(); 
	String str = new String();
	Scanner s  = new Scanner(System.in); 
	str=s.next(); 
	int ans = Compute(str);
	System.out.println("THE least nuymber of alphabets required is :"+ans);
	
	
	}

	public static int Compute(String str) {
	
	/*	int len = str.length(); 
		StringBuffer  sb = new StringBuffer(str); 
		for(int i = len-1 , kk=0; i >=0 , kk<len ; i--,kk++)
		{ 
			int count = 0 ; 
			sb.insert(0, str.charAt(i)) ;
			System.out.println("yy----"+sb);
			count++; 
			String trial = "";
			
			for(int j  = sb.length()-1 ; j >=0 ;j--)
			{
				trial =trial+sb.charAt(j);
				if(trial.equals(sb)) 
				{
				  return count;
				}
				
			}
		//	System.out.println("String after checking " + trial);
		}
		return  55;*/
		//---------------------------------
	
		int len  = str.length();
		StringBuffer sb = new StringBuffer (str); 
		int i = len-1; 
		int j = 0,count= 0 ; 
		while(i>0)
		{
		   
		   sb.insert(j, str.charAt(i));
		   System.out.println("j:"+j );
		   j++;i--;
		   System.out.println("formed sb :"+sb );
		   count++;
		   
		   //--checker---
		   String check = ""; 
		   for(int k = sb.length()-1 ; k >=0 ; k--)
		   {
			   check = check+sb.charAt(k); 
			   
		   }
		   System.out.println("check "+check);
		   if(check.equals(sb.toString()))
		   {
			   System.out.println("pop");
			    return count ;   
		   }
		   
		   
		}
		
		
		return -66;
		
	}          
	
}


