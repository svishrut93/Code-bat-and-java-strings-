package codebat1;
//Finding all repeated words in a text . 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set; 


public class allwordcount {
	
	
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
		int count = 0 ;
		HashMap <String , Integer > map  = new HashMap <String , Integer>(); 
		for(String s : arr)
		{
			
			
			
			if(!map.containsKey(s))
			{
				map.put(s, 1);
			}
			else
			{
			      count = map.get(s);
				map.put(s, count+1);
			}
		}
		System.out.println("map contents "+map);
		//
			Set<Entry<String,Integer>> entrrySet= map.entrySet();
	    
	    String res = ""; 
	    ArrayList al = new ArrayList();
	    al.addAll(entrrySet);
	    System.out.println("Duplicate  words : ");
	    for( Entry<String, Integer> e: entrrySet )
		{
	    	
	    	if(e.getValue()>=2 )
	    	{
	    		res= e.getKey();
	    		count = e.getValue();
	    		System.out.println(e.getKey()+"  "+e.getValue());
	    	}	
		}     
	   
	    
		return 0;
	}
}

	


