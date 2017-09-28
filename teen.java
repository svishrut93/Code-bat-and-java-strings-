//We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
//Given 3 int values, return true if 1 or more of them are teen.

package codebat1;
import java.util.*;


public class teen {
	
	
	public static void main(String args[])
	{
		int n1,n2,n3 ; 
		System.out.println("Enter the 3 number ");
		Scanner s = new Scanner (System.in);
		n1=s.nextInt();
		n2=s.nextInt();
		n3=s.nextInt();
				System.out.println(Compute(n1,n2,n3));
		
	}
	
	public static boolean Compute(int  n1, int n2 , int n3 )
	{
		if(  (n1>=13 && n1<=19 )|| (n2>=13 && n2<=19 ) ||(n3>=13 && n3<=19 )  )
		{
			return true;
		}
		else
		{
			return false ;	
		}
	}
}
