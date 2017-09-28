package codebat1;
import java.util.* ; 
public class thirdbig {
	
	
//Given a non-empty array of integers, return the third maximum number in this array. 
//If it does not exist, return the maximum number. The time complexity must be in O(n).

	public static void main(String args[])
	{
	  Scanner s = new Scanner(System.in);
	  int inlen ; 
	  System.out.println("how many elements do you want to enter " );
	  inlen = s.nextInt() ; 
	  System.out.println("Entyer the elements ");
	  
	  int[] nums = new int[inlen];
	  
	  for(int i = 0 ; i < inlen ; i ++)
		  nums[i]= s.nextInt(); 
	  
	int ans = compute(nums); 
	System.out.println("The 3rd largest is ...." + ans );
	}
	private static int compute(int [] nums)
	{
		int[] maximum = new int [3];
		int max = nums[0] ; 
		
		if(nums.length==0 || nums.length == 1)
		{
			return nums[0] ; 	
		}
		
		if(nums.length<3)
		{
			if(nums[0]>nums[1] )
				return nums[0];
			else
				return nums[1]; 
		}
		
	for(int itr = 0 ; itr <maximum.length ; itr++)
	{ 
		max= nums[0];
		for(int i = 0 ; i < nums.length; i++)
		{
			if(nums[i]>max )
			{
				max = nums[i] ; 
			}
		}
		if(itr==0)
			maximum[itr]=max ;
		if((itr!= 0 ) && max!=maximum[itr-1])
		{
		maximum[itr]=max ; 
		}
		
		for(int j = 0 ; j < nums.length; j++)
		{
			System.out.println("enter 2 loop");
			if(nums[j] == maximum[itr])
			{
				System.out.println("enter if");
				nums[j]=-nums[j] ; 
				break ; 
			}
		}	
	 }	
	for(int itr = 0 ; itr < maximum.length ; itr++ )
	{
		System.out.println(maximum[itr]);
	}
	
	if(maximum[2]==maximum[1])
		return maximum[0] ; 
	
	return maximum[2];
	}
	
}
