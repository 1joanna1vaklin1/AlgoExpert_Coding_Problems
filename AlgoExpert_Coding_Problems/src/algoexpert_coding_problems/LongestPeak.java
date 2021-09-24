//LongestPeak problem from AlgoExpert.io 
//Find the longest length peak in an int array. A peak is defined as adjacent ints
//where on the left side of peak are strictly increasing and right side, strictly decreasing.
//Self Written code with help from algoExpert.io video. 
//Joanna B. Vaklin

import java.util.*;

public class LongestPeak {
  public static int longestPeak(int[] array) {
  
		if(array.length <= 2)
			return 0; 
		int i = 1; 
		int maxPeak = 0; 
		
		while(i < array.length-1)
		{
			int possiblePeak = array[i];
			int currentPeakLength = 0; 
			
			if(array[i-1] < possiblePeak && array[i+1] < possiblePeak)
			{
				currentPeakLength = 3; 
				int leftPointer = i-2;
				int rightPointer = i+2;
				while(leftPointer >= 0)
				{
					if(array[leftPointer] < array[leftPointer+1])
						currentPeakLength++;
					else
						break;
					leftPointer--;
				}
				while(rightPointer < array.length)
				{
					if(array[rightPointer] < array[rightPointer-1])
						currentPeakLength++;
					else
						break;
					rightPointer++; 
				}
				
				if(currentPeakLength > maxPeak)
					maxPeak = currentPeakLength;
				
			}
			i++;	
			
		}

    return maxPeak;
  }
}
