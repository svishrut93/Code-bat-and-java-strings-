package codebat1;
import java.util.*; 


public class Reverseastring {
	
	public static void main(String args[])
	{
		System.out.println("Enter the string to reverse ");
		StringBuffer sb = new StringBuffer(); 
		Scanner s  = new Scanner(System.in); 
		sb.append(s.nextLine()) ;              // accepting string from user into string buffer 
		String com2 = sb.toString();
		String str1= Compute1(sb);
		System.out.println("Reverse using string buffer :"+str1);
		
		String str2 = Compute2(com2);
		
		System.out.println("Reverse using toCharArray :"+str2);
	}
   	
	public static String Compute1 (StringBuffer sb )// using reverse 
	
	{
	   String str = ""; 
	   str = str+sb.reverse();
	   
	return str ; 
	}
     public static String Compute2 (String com2 )//toCharArray
	{
    	
    	 String send="" ; 
	   char[] arr = com2.toCharArray();
	   for (int i = arr.length - 1; i >= 0; i--)
	   {
	       send=send+arr[i];  
	      
	   }
	   
	return send ; 
	}

}
