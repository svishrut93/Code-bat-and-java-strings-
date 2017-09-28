package codebat1;
import java.util.Scanner;
import java.util.*;

public class missingchar {
	
	
	public static void main(String args[])
	{
		int n ; 
		String str;
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		str=s.next();
		
		System.out.println("integer is "+n);
		System.out.println("string is "+str);
		
		String man1; 
		String man2; 
		String ans; 
		man1 = str.substring(0,n); 
        man2 = str.substring(n+1,str.length());		
        ans = man1+man2 ; 
		System.out.println("ans = "+man1+man2);
		
		
	}

}
