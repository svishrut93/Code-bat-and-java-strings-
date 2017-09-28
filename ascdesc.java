package codebat1;
import java.util.Scanner ;

public class ascdesc {
	
	public static void main(String args[])
	{
		String input ;
		System.out.println("Enter string with odd number of chars: ")		;
		Scanner s = new Scanner(System.in);
		input = s.nextLine();
		
		//COnvert to char array 
		char[] stringtoarr = input.toCharArray();
		int length = input.length(); 
		
		
		// Quick sort 
	//	quicksortasc (  0,(length/2)-1  );
	//	quicksortdsc  (length/2+1, length-1); 
		
		int counter = 1; 
		int  mat[][] = new int[3][3];

		for(int i = 0 ; i < 3 ; i ++ )
		{
			for(int j =0; j < 3 ; j++)
			{
				mat[i][j]=counter;
				counter++;
			}
		}
		
		System.out.println("Printing populated matrix : ");
		
		for(int i = 0 ; i <3 ; i ++)
		{
			for(int j = 0 ; j < 3; j++)
			{
				System.out.print("  "+mat[i][j]);
			}
			System.out.println();
		}
		
		
		
		
	}
	
	
	
	
	
	
		
		
		
		
		
	
	

}
