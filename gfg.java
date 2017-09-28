package codebat1;
import java.util.*; 
import java.util.Scanner;


//Write an efficient C function that takes two strings as arguments
//and removes the characters from first string which are present 
//in second string (mask string)

public class gfg {

	public static void main(String args[])
	{
		HashMap<String , String > map = new HashMap<String , String >(); 
		map.put("Vishrut", "King");
		map.put("Narendra", "minister"); 
		map.put("SRK", "rook");
	    
		System.out.println(map );
		
		//-------------------------------------------------------------
		
		System.out.println("Size: "+map.size());
		System.out.println(("ALL keys :"+map.keySet()));
		System.out.println(("keySet : "+  map.hashCode()     ));
		System.out.println("Values are "+map.values());
		map.remove("SRK"); 
		System.out.println(map.entrySet() );
		map.clear();
		System.out.println(map.entrySet() );
		
	}
	
	
}
