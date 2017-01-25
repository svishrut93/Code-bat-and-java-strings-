package codebat1;
import java.util.Scanner ; 
public class mergetwoarrays {
	public static void main(String args[]) 
	{
	
	int [] two = new int[5] ; 
	System.out.println("enter number of elements for one array") ; 
	Scanner s = new Scanner (System.in ) ; 
	int n  = s.nextInt();
	int [] one = new int[n+5]; 
	System.out.println("Enter the new array " ); 
   	for(int i = 0 ; i < n ; i ++)
     	{
   	     	one[i] = s.nextInt(); 
   	    }
   	System.out.println("enter number of elements for two array") ; 
	for(int i = 0 ; i < 5 ; i ++)
 	{
	     	two[i] = s.nextInt(); 
	}	
	//merging 
	for(int i = n, j=0 ; i < n+5  ;  i ++ , j++ )
	{
	    one[i]=two[j]; 
	}
	System.out.println("the merged array is ....");
	for(int i = 0 ; i < n+5  ; i ++)
	{
		System.out.println(one[i]);
	}
	quicksort(one , 0 , one.length-1 ) ; 
	
	System.out.println("The array after sorting is");
	for( int m = 0 ; m < one.length ; m ++ ) 
	{
		System.out.print(one[m]+" ");
	}
	}

	private static void quicksort(int[] one, int lower, int higher ) 
	{
		int  i = lower; 
		int j = higher ; 
		int pivot = one [((higher + lower)/2)] ; 
		while ( i <= j ) 
		{
			while( one[i] < pivot ) i ++ ; 
			while ( one[j] > pivot ) j --  ; 
			if( i <= j ) 
			{
				exchange(i,j, one); 
				i++ ; j -- ; 
			}
		}
			if( lower <  j )
				quicksort(one ,lower, j  ); 
				
		   if(i < higher )
			   quicksort(one , i , higher ) ;   
		
	}
	private static   void exchange(int i, int j, int[] one) {
		int temp = one[i];
		one[i]= one[j] ; 
		one[j] = temp ; 		
	}
	
}
