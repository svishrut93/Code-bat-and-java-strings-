package codebat1;
import java.util.Scanner ;


public class backaround {
	 

	public static void main(String args[])
	{
		String str ; 
		Scanner s = new Scanner (System.in);
		str=s.next();
		//Compute(str);
		System.out.println("Thre changed string is "+Compute(str));
		
	}
	
	
	static String Compute (String str)
	{

		int len;
		char ch ;
		String ans ; 
		len= str.length();
		System.out.println("The length of the string is "+len);
		ch=str.charAt(len-1);
		ans=ch+str+ch;
		return ans ;
		
		
		
		
		
	}
	
	
}
