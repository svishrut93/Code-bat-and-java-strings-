//Write a java program to count the number of words in a string

package codebat1;
import java.util.*;

public class wordcount {
	
	public static void main(String args[]) 
	{
		
		String str = ""; 
		Scanner s = new Scanner (System.in); 
		str = s.nextLine(); 
		int ans = WordCount(str); 
		System.out.println("The number of words in sentence is :  "+ans);
	}

	public static int WordCount(String str) {
		
		String [] strr = str.split(" "); 
		int len = strr.length; 
		return strr.length;  
	
		// TODO Auto-generated method stub
	
	}
	
	
	

}
