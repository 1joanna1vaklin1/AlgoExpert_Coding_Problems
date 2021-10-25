//Subarray Sort problem on AlgoExpert.io
//Return the [firstIndex, secondIndex] of a subarray
//that, if it is sorted, then the whole array is sorted. 
//O(N) time and 0(1) space
//Self written code with help from AlgoExpert hints
//Joanna B. Vaklin

import java.util.*;

public class SubarraySort {
	
	public static void main(String []args)
	{
		
		int[] answer = subarraySort(new int [] {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19});
	}
		
  public static int[] subarraySort(int[] array) {

		int prev = 0; 
		int currentMin = Integer.MAX_VALUE;
		int currentMax = Integer.MIN_VALUE;
		int startingIndex = -1;
		int endingIndex = -1; 
		for(int i = 1; i < array.length; i++)
		{
			if(array[prev] > array[i])
			{
				if(array[prev] > currentMax)
					currentMax = array[prev];
				if(array[i] < currentMin)
					currentMin = array[i];				
			}
			prev = i; 
			
		}

		boolean startingNotFound = true; 
		for(int j = 0; j < array.length; j++)
		{
			if(array[j] > currentMin && startingNotFound)
			{
				startingIndex = j;
				startingNotFound = false;
			}
			if(array[j] >= currentMin && array[j] <= currentMax)
			{
				endingIndex = j;
			}
		}
		
		return new int[] {startingIndex, endingIndex};
  }
}
