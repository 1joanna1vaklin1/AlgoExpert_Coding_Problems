//Merge overlapping intervals problem from AlgoExpert.io
//Solution is written by me with help from the AlgoExpert solution and video
//Joanna B. Vaklin 

import java.util.*;

public class MergeOverlappingIntervals {

  public int[][] mergeOverlappingIntervals(int[][] intervals) {
    
		//Interesting way to quickly sort the intervals in the 2Darray to
		//ensure that in [a,b] [c,d] that a < c 
		//comparing on the first num in each index
		Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
		
		//if we were to create a merged interval 2d array, each time
		//we add to it, we would need a copy and then add it since
		//array sizes are set. So we can create a list<int[]> because
		//it is much easier to manipulate it that way.
		List<int []> mergedIntervals = new ArrayList<int[]>();
		int[] currentInterval = intervals[0];
		mergedIntervals.add(currentInterval);
		
		for(int[] next : intervals)
		{
			int currentIntervalEnd = currentInterval[1]; 
			int nextIntervalStart = next[0];
			int nextIntervalEnd = next[1];
			
			if(nextIntervalStart <= currentIntervalEnd)
			{
				currentInterval[1] = Math.max(currentIntervalEnd, nextIntervalEnd); 
				
			}
			else
			{
				currentInterval = next;
				mergedIntervals.add(currentInterval);
			}
			
		}
		
		
		//creating a 2d array with the arraylist so that it returns the proper
		//return object as specified in the method header.
    return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
  }
}
