package codebat1;

import java.util.Arrays;
import java.util.*;

//Given a sequence of words, print all anagrams together | Set 1
//Given an array of words, print all anagrams together. 
//For example, if the given array is
//{“cat”, “dog”, “tac”, “god”, “act”}, then 
//output may be “cat tac act dog god”.


public class anagramver1 {
	
	public static void main(String args[])
	{
		int [] ann = {8,6,7,5,3,0,9}; 
		
		
		int len = ann.length/2 ; 
		System.out.println("Two groups " + len);
		
		
		
		int [] ans = new int[3]; 
		ans[0]= ann[len-1];
	    ans[1]= ann[len];
	    ans[2]= ann[len+1];
		
	    
	    for(int i = 0 ; i < ans.length; i ++ )
	    System.out.println(ans[i]);
		
		
	}
	
	
}
