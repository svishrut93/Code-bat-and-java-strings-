package codebat1;
import java.util.Scanner; 
import java.math.*;


public class diff21 {
	
	public static void main(String args[])
	{

	int n ;
	int ans;
	
	System.out.println("Enter a value for n ");
	Scanner s = new Scanner (System.in);
	n=s.nextInt();
	if(n<=21)
	{
	ans = Math.abs(n-21);
	System.out.println(ans);
	}
	else
	{
		ans=Math.abs(n-21)*2;
		System.out.println(ans);
	}
	}
	
	
}
