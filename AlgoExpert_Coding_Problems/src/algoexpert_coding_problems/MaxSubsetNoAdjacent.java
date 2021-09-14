import java.util.*;

//The Max Subset - No adjacent problem from AlgoExpert.io
//This problem is solved with Dynamic Programming
//Self-Written solution with help from AlgoExpert.io video and solution
//Time Complexity O(N) where N is = to the length of the input array
//Space Complexity 0(1) constant space
//Joanna B Vaklin


public class MaxSubSetWithNoAdjacent {
  public static int maxSubsetSumNoAdjacent(int[] array) {
   
		if(array.length == 0)
			return 0; 
		if(array.length == 1)
			return array[0];
		
		int maxSum = Math.max(array[0], array[1]); 
		int first = maxSum;
		int second = array[0]; 
		
		for(int i = 2; i < array.length; i++)
		{
			
			maxSum = first > (second + array[i]) ? first : (second + array[i]);
			second = first; 
			first = maxSum;
		}
		
		
    return maxSum;
  }
}
