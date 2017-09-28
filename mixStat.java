package codebat1;
import java.util.*;

public class mixStat {
	
	public static void main(String args[])
	{
		
		Scanner s= new Scanner (System.in);
		System.out.println("Enter a string ");
		String str ; 
		int len; 
	   str=s.nextLine();
	   len= str.length();
	   if(len>=3)
	   {
	   System.out.println(Compute(str));
	   }
	   else
	   {
		System.out.println("String too small ");   
	   }
		
	}
	public static boolean Compute(String str)
	{
	 
	   String sub= str.substring(1,3); 
	   System.out.println(sub);
	   
	   if(sub.equals("ix"))
	   {
		
		return true ;
	   }
	   else
	   {
	
		return false; 
	   }
	}
	
	

}
