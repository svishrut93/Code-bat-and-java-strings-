package codebat1;

import java.util.Scanner;

public class thirdbig2 {
	
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
	System.out.println("returnrd :"+ ans );
	}
	private static int compute(int [] nums)
	{
		int higher = nums.length-1;
		int lower =0 ;
		int[] ans1 = quicksort(higher , lower , nums );
		System.out.println("After quick sort "); 
		for(int i = 0 ; i<ans1.length ; i ++) 
		{
			System.out.println(ans1[i]);
		}
		return 5; 
	}
	
	private static int[] quicksort(int higher , int lower , int [] nums)
	{
		int i = lower ;
		int j = higher ; 
		int pivot = nums[(lower + higher) / 2 ]; 
		while( i <= j ) 
		{
			while(nums[i] < pivot ) 	i++;
			while(nums[j]> pivot  )  j ++ ; 
			
			if(i<=j)
			{
				exchange(i,j, nums); 
				i++; j-- ; 
			}
		}
		if(lower<j)
		quicksort (lower  , j , nums); 
	    if(i < higher ) 
		quicksort(i , higher, nums);
	    
	    return nums ; 
		
	}
	private static void exchange( int i , int j , int[] nums ) 
	{
		int temp = nums[i] ; 
		nums[i] = nums[j] ; 
		nums[j] = temp ; 
	}
}
