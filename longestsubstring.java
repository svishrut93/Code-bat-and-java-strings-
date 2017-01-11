package codebat1;
import java.util.*; 




//Write a java program to find the longest substring without repeating characters 
//Linked Hash Map
public class longestsubstring {
	
	public static void main(String args[])
	{
		
		
	System.out.println("Enter the string to check");
	//StringBuffer sb = new StringBuffer(); 
	String str = new String();
	Scanner s  = new Scanner(System.in); 
	str=s.next(); 
	String ans= Compute(str);
	
	System.out.println("THE longest substring is  :"+ans);
	
	
	}
	
	public static String Compute(String str )
	{
		char[] strarr = str.toCharArray(); 
		LinkedHashMap <Character , Integer> lhm = new LinkedHashMap<Character, Integer>(); 
		
		
		for(int i = 0 ; i < strarr.length; i++)
		{
			if(!lhm.containsKey(strarr[i]))
			{
				lhm.put(strarr[i], i);
			}
			else
			{
				i=lhm.get(strarr[i]);
				lhm.clear();        //clear the map till the repeating element 
			}
		}
		ArrayList<Character> al = new ArrayList (lhm.keySet());
				//(ArrayList<Character>) lhm.keySet();
		//al = lhm.keySet();
		System.out.println("The longest substring is ..."+al);
		
		String mac = al.toString(); 
		
		return mac; 
		
	}

}
