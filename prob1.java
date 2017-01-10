package codebat1;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set; 


//1) Write a java program to find the duplicate words and their 
//   number of occurrences in a string?

public class wordcount2 {
	public static void main(String args[]) 
	{
		String str = ""; 
		Scanner s = new Scanner (System.in); 
		System.out.println("Enter a sentence "); 
		str = s.nextLine(); 
		WordCount(str); 
		
	}
	
	public static int WordCount(String str) {
	
		String[] arr = str.split(" "); 
		HashMap <String , Integer > map  = new HashMap <String , Integer>(); 
		for(String s : arr)
		{
			if(!map.containsKey(s))
			{
				map.put(s, 1);
			}
			else
			{
				int count = map.get(s);
				map.put(s, count+1);
			}
		}
		System.out.println("map contents "+map);
		//
			Set<Entry<String,Integer>> entrrySet= map.entrySet();
	    int count = 0 ; 
	    String res = ""; 
	    for( Entry<String, Integer> e: entrrySet )
		{
	    	if(e.getValue()>count )
	    	{
	    		res= e.getKey();
	    		count = e.getValue();
	    	}
	    	
	    	
			
		}
	    System.out.println("set contents "+entrrySet);
	    System.out.println("The most occuring word is : "+ res);
	    System.out.println("Its count is ..."+ count ); 
	
		return 0;
	}
}
