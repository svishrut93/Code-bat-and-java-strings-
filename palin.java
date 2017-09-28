package codebat1;
import java.util.Scanner ; 

public class palin {
	
	public static void main(String [] args ) 
	{
		String build = "" ;
		String build2 = ""; 
	    Scanner s = new Scanner (System.in) ; 
	 
	    System.out.println("Enter a sentence ") ; 
	    String str = s.next(); 
	   
	    boolean m = palin(str) ; System.out.println(m);
	    
	}
	public static Boolean palin (String str )
	{
		int len = str.length(); 
		
		for(int i = 0 ; i <len/2 ; i ++ )
		{
	             if (str.charAt(i)!=str.charAt(len-i-1))
	            	 return false; 

		}
		return true ; 
	}
	
	
	

}
