package codebat1;
import java.util.*; 

public class hourglass {
	
	public static void main(String args [] )
	{
		/*int arr [][] = new int [6][6]; 
		Scanner s = new Scanner (System.in);
		
		
		for( int i = 0 ; i < 6; i ++ )
		{
			for( int j = 0 ; j < 6 ; j ++ )
			{
				arr[i][j] = s.nextInt(); 
			}
		}*/ 
		
		int arr [][] = { {1,1,1,1,1,1},
						 {2,2,2,2,2,2,},
						 {3,3,3,3,3,3},
						 {4,4,4,4,4,4},
						 {5,5,5,5,5,5},
						 {6,6,6,6,6,6}
	                   }; 
		 calc(arr);
		
	}
		
		public static void calc(int[][] arr)
		{
			
			
			HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>(); 
			
		
		System.out.println("Displaying matrix " );
		
		for( int i = 0 ; i < 6; i ++ )
		{
			for( int j = 0 ; j < 6 ; j++ )
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	 
		int rowtrack = 3 ; 
		int coltrack = 3 ; 
		int counter = 0 ; 
	
		while(counter < 16 )
		{
			int sum3 = 0 ;
			int i , j ; 
			
	   //  System.out.println ("sum3 is.. "+sum3);
	     for( i = rowtrack-3 ; i < rowtrack ; i++)
		{		
	    	 if(i ==rowtrack-2 )
	    	 {
				sum3+= arr[i][i] ;
				System.out.println(" "+" "+arr[i][i]);
			//	System.out.println();
	    	 }
	    	 else
	    	 {
	    		 for ( j = coltrack-3; j < coltrack ; j ++)
	    		 {
			     	sum3+= arr[i][j];	
			     	System.out.print(arr[i][j]+" ");
	    		 }
	    		 System.out.println();
	    	 }
	    	
		}
	     if(rowtrack==6)
	     {
	    	 rowtrack=3;
	    	 coltrack++;
	     }
	     else
	     {
	    	 rowtrack = rowtrack+1 ; 
	     }
	     
	    /* if(coltrack==6)
	     {
	    	 coltrack=3;
	     }
	     else
	     {
	    	 coltrack = coltrack+1 ; 
	     } */
	     System.out.println("sum of "+(counter+1)+" hour glass : " + sum3 ); 
	     hm.put(counter+1, sum3);
	     
	     System.out.println ("====================");
	    //System.out.println("counter is "+ counter+1);
		counter++ ; 
		}
		System.out.println("  Hash map " ); 
		System.out.println(hm);
		// Extracting maximum 
		  int maxValueInMap=(Collections.max(hm.values()));
		
		System.out.println(maxValueInMap);
		
		
		
		}
		
		
	
		
	
}

