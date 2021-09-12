import java.util.*;

//Validate Subsequence problem from AlgoExpert.io
//Self written code with help from AlgoExpert videos and solutions 

public class ValidateSubsequence {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    
		int arrayPointer = 0;
		int sequencePointer = 0; 
		
		while(arrayPointer < array.size() && sequencePointer < sequence.size())
		{
			if(array.get(arrayPointer).equals(sequence.get(sequencePointer)))
			{
				sequencePointer++; 
			}
			arrayPointer++;
		}
		
		return (sequencePointer == sequence.size());
		
  }
}
