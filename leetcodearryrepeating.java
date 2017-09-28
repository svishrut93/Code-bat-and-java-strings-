package codebat1;
import java.util.* ; 

//Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

//Do not allocate extra space for another array, you must do this in place with constant memory.

//For example,
//Given input array nums = [1,1,2],

public class leetcodearryrepeating {
	
	public static void main(String args[] ) 
	{
		Scanner s = new Scanner (System.in) ; 
		
	
	System.out.println("enter the number of elements " ) ; 
	int n = s.nextInt();
	int [] x = new int [n]; 
	System.out.println("Enter the lements " ); 

	for( int i = 0 ; i < n ; i ++)
	{
		x[i] = s.nextInt(); 
	}
	if(n < 2) 
		System.out.println("unique elements :"+ 1); 
	
	 HashMap <Integer, Integer > hm = new HashMap<Integer , Integer> () ; 
     for( int i : x )
     {
         if(!hm.containsKey(i))
         
         hm.put ( i , 1 );
         
         else
         {
             int count = hm.get(i); 
             hm.put(i , count+1) ; 
         }
     }
     ArrayList<Integer> AL = new ArrayList<Integer> () ; 
     for(int i : hm.keySet())
     {
         //if(hm.get(i)==1)
              AL.add(i) ; 
     }
     System.out.println(AL); 
     System.out.println("The unique elements is "+ AL.size());
     
 //    (char)('A' + n % 26));
     System.out.println("ebter n ") ; 
     int temp = s.nextInt(); 
    
     StringBuffer y =  'A' + n % 26 ;
     System.out.println (y);
	}
}
