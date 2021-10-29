//LargestRange problem from AlgoExpert.io
//Self written code with help on the algorithm 
//from AlgoExpert.io solutions, hints, and video
//Joanna B. Vaklin

import java.util.*;

public class LargestRange {
	
	//one example in the main method
	//it should return [0, 7] since that range exists in the int array
	//and is the greatest of all ranges that exist in the array
	public static void main(String [] args)
	{
		int [] array = new int[] {1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6};
		
		int [] largestRange = largestRange(array); 
	}
	
  public static int[] largestRange(int[] array) {

	Map<Integer, Boolean> nums = new HashMap<Integer, Boolean>();
 	int currentRangeCount = 0; 
	int longestRange = Integer.MIN_VALUE;
	int [] range = new int[2]; 
		
		for(int num : array)
		{
			nums.put(num, false);
		}
		
		for(int num : array)
		{
			//meaning it was an already visited num in another range
			if(nums.get(num))
				continue;
			
			else
			{
				nums.put(num, true);
				int minusNum = num - 1;
				int plusNum = num + 1;
				currentRangeCount = 1; 
				
				//checking all the numbers to the left of currentNum
				while(nums.containsKey(minusNum))
				{
					nums.put(minusNum, true);
					currentRangeCount++; 
					minusNum--; 
				}
 				//checking all the numbers to the right of currentNum
				while(nums.containsKey(plusNum))
				{
					nums.put(plusNum, true);
					currentRangeCount++;
					plusNum++;
				}
				//updating LongestRange
				if(currentRangeCount > longestRange)
				{
					longestRange = currentRangeCount;
					range = new int[] {minusNum + 1, plusNum - 1};
				}
			}
			
		}
	return range;
  }
}
