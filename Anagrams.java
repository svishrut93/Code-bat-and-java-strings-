package codebat1;

import java.util.*;

public class Anagrams {
	
	
	public static void main(String args[])
	{
		
		
	System.out.println("Enter 2 strings to check for anagrams ");
	//StringBuffer sb = new StringBuffer(); 
	String str1 = new String();
	String str2 = new String();
	Scanner s  = new Scanner(System.in); 
	
	str1=s.next(); 
	str2=s.next();
	
	Boolean ans= Compute(str1,str2);
	
	System.out.println("They are anagrams  :"+ans);
	}
	
	
	public static boolean Compute (String str1 , String str2 )
	{
		
		char[] ch1 = str1.toCharArray();
	    char[] ch2 = str2.toCharArray();
	    Arrays.sort(ch1);
	    Arrays.sort(ch2);
	    return Arrays.equals(ch1,ch2);
	}
	}
	
	


