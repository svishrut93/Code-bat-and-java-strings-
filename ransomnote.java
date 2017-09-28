package codebat1;
import java.util.* ; 

public class ransomnote {
	
	public static void main(String args[] ) 
	{
		Scanner s = new Scanner (System.in ) ; 
	    String ransom = s.next() ; 
		
		for( int i = 0 ; i <ransom.length()  ; i ++ ) 
		{
		      int count = (int) ransom.charAt(i)- 'A'; 
		      System.out.println(count) ; 
		}
	System.out.println(Integer.MAX_VALUE);
	System.out.println(Integer.MIN_VALUE);
	}
	
	
	

}
