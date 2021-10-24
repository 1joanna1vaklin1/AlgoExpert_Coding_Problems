//IN PROGRESS 

import java.util.*;

public class SubarraySort {
  public static int[] subarraySort(int[] array) {

		int prev = 0; 
		int currentMin = Integer.MAX_VALUE;
		int currentMax = Integer.MIN_VALUE;
		int startingIndex = 0;
		int endingIndex = 0; 
		for(int i = 1; i < array.length; i++)
		{
			if(array[prev] > array[i])
			{
				if(array[prev] > currentMax)
					currentMax = array[prev];
				if(array[i] < currentMin)
					currentMin = array[i];				
			}
			
		}
		
		boolean startingNotFound = true;

		for(int j = 0; j < array.length; j++)
		{
			if(array[j] >= currentMin && startingNotFound)
			{
				
			}
		}
		
		
		
		return new int[] {};
  }
}
