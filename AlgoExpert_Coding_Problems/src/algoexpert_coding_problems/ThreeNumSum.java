import java.util.*;

//Three Number Sum question from AlgoExpert.io
//Self-Written Code with help from AlgoExpert.io solutions
//Input takes an array of ints and int targetSum and you must return 
//all possible triplets from the array that sum up to the targetSum.
// Return the list with the lists of possible triplets.

public class ThreeNumSum 

{
  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {

		Arrays.sort(array);
		
		int leftPointer = 0; 
		int rightPointer = array.length; 
		int currentSum = 0; 
		List<Integer[]> threeNumSums = new ArrayList<Integer[]>(); 
		
		for(int i = 0; i < array.length - 2; i++)
		{
			leftPointer = i + 1;
			rightPointer = array.length-1; 
			
			while(leftPointer < rightPointer)
			{
				currentSum = array[i] + array[leftPointer] + array[rightPointer];
				if(currentSum < targetSum)
				{
					leftPointer+=1; 
				}
				else if(currentSum > targetSum)
				{
					rightPointer-= 1;
				}
				else
				{
					Integer[] triplet = {array[i], array[leftPointer], array[rightPointer]};
					threeNumSums.add(triplet); 
					leftPointer+=1;
					rightPointer-=1; 
					
				}
				
			}
		}
		
		
		return threeNumSums;
  }
} 
