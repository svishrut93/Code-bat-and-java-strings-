package codebat1;

import java.util.Scanner;

public class StartHi {
	
	
	public static void main(String args[])
	{
		String str ; 
		Scanner s = new Scanner (System.in);
		str=s.next();
		
		//Compute(str);
		System.out.println(Compute(str));
		
	}
	public static boolean Compute (String str )
	{
		
		String f ; 
		f  =str.substring(0,3);
		/*if(  f.startsWith("hii") || f.startsWith("Hii"))
		{
			return true;
		}
		else
		{
			return false; 
		}	*/
		
		if(f.equals("Hii")||(f.equals("hii")))
		{
			return true;
		}
		else
		{
			return false ;
		}
		
	}
	
	

}
