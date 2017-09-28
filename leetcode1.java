package codebat1;
import java.util.*;
import java.util.Map.Entry; 
/*Given a string, sort it in decreasing order based on the frequency of characters.

Example 1:

Input:
"tree"

Output:
"eert"

Explanation:
'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
Example 2:

Input:
"cccaaa"

Output:
"cccaaa"

Explanation:
Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
Note that "cacaca" is incorrect, as the same characters must be together.
Example 3:

Input:
"Aabb"

Output:
"bbAa"

Explanation:
"bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters*/
public class leetcode1 {

	public static void main(String args[])
	{
		String ip; 
		Scanner s = new Scanner(System.in) ; 
		System.out.println("Enter a word "); 
		ip = s.next();
		
		frequencysort(ip); 
			
	}	
	
	public static void frequencysort(String ip) 
	{
		 HashMap<	Character,Integer> hm = new HashMap<Character,Integer>(); 
	       char[] meet = ip.toCharArray(); 
	       for(Character c : meet)
	       {
	           if(!hm.containsKey(c))
	           {
	               hm.put(c,1); 
	           }
	           else
	           {
	               int count =  hm.get(c);
	               hm.put(c,count+1); 
	           }   
	       }
	       System.out.println(hm);
	       //Set<Entry<Character,Integer>> ans= hm.entrySet();
	      
	      //   Set <Character> set2 = hm.keySet(); 
	     //  ArrayList <Character> AL = new ArrayList<Character> (set2);       
	     // ArrayList<Entry<String, String>> listOfEntry = new ArrayList<Entry<String,String>>();
	    //   TreeMap<Integer ,Character> tm = new TreeMap<Integer,Character>(); 
	       
	       int [] mac = new int[256] ;
	       int[] freq = new int [256];
	        for (char ch: meet) freq[ch]++;
	        //=================
	        System.out.println("------------------");
	        ArrayList AL = new ArrayList();
	        for(int i = 0 ; i < freq.length ; i ++ )
	        {
	        	if(freq[i]!=0)
	        	{
	        		AL.add(freq[i]); 
	        	}
	        	
	        }
	        Collections.sort(AL, Collections.reverseOrder());
	        
	        
	        	System.out.println(AL.toString());
	       
	        
	        System.out.println("------------------");
	      //===============================
	        
	        
	        
	        
	      //  for(char ch :meet ) System.out.println(freq[ch]);
	        TreeMap<Integer ,List<Character>> tm = new TreeMap<Integer,List<Character>>(); 
	        for (int i=0; i<freq.length; i++)
	        {
	        	if(freq[i]>0)
	        	{
	        		if(!tm.containsKey(freq[i]))
	        		{
	        			
	        			tm.put(freq[i], new LinkedList<Character>() );
	        		}
	        		  tm.get(freq[i]).add((char)i)  ;
	        		
	        	}
	        }    
	  String ans = ""; 
	  for(int i : tm.keySet())
	  {
		  ans = ans+tm.get(i); 
	  }
	  System.out.println("jikina");
	  System.out.println(tm);
	  for(int i =ans.length()-1 ; i>=0; i--)
	  {
		 //for(int j = tm.))
		  
		 // System.out.print(ans.charAt(i));
	  }
	  byte [] Key = {0x1A,0x2B,0x3C,0x4D,0x5E,0x6F,0x77};
	  for(byte i = 0 ; i < 7;i++)
		{
			System.out.println((byte)Key[i]);	
		}
	}
}
