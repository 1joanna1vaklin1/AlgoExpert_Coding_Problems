//IN PROGRESS


import java.util.*;

public class LargestRange {
  public static int[] largestRange(int[] array) {
    
		Arrays.sort(array);
		
		int prev = array[0];
		int current = 0;
		boolean continuingRange = false;
		int currentX = 0;
		int currentY = 0;
		int count = 0; 
		int currentMax = Integer.MIN_VALUE;
		int firstIndex = 0;
		int lastIndex = 0;
		
		for(int i = 1; i < array.length; i++)
		{
			current = array[i]; 
			if(current == (prev) + 1)
			{
				if(continuingRange)
				{
					currentY = current; 
					count++;
				}
				else
				{
					currentX = prev;
					currentY = current;
					continuingRange = true; 
					count = 1;
				}
			}
			else
			{
				if(count > currentMax)
				{
					currentMax = count; 
					firstIndex = currentX;
					lastIndex = currentY;
				}
				count = 0;
			}
		}
		
    return new int[] {firstIndex, lastIndex};
  }
}
