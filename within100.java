package codebat1;
import java.util.Scanner;


public class within100 {

	
	
	public static void main(String args[])
	{
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int ans =Math.abs(100-n);
//	if(  ( (100-n) <=10) || ( (100-n)>=-10 ) ) 
	
	if(ans <=10)
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
		
	}

	}
	
}
