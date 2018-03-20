package Prac;

public class PrintDiag {
	
	
	public static void main(String[] args) {
		
		//int[][] arr = new int [4][4];
		
		
		int[][] arr = {
						{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12},
						{13,14,15,16}
					};
		
		System.out.println("Printing left diagonals ");
		
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j= 0 ; j <arr[i].length ; j++)
			{
				if (i==j)
				{
					System.out.println("left diagonals ");
					System.out.println(" "+ arr[i][j]+" ");
				}
				else if(i+j == arr.length-1)
				{
					{
						System.out.println("Right diagonal ");
						System.out.println(" "+ arr[i][j]+" ");
					}
				}
				
			}
		}
		
		
	}
}


