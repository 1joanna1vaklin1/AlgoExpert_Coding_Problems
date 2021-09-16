import java.util.*;

//Two Number Sum problem on algoExpert.io
//Self written code with help from algoExpert videos, hints, and solutions.
//Joanna B. Vaklin 

public class TwoNumSum {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    
		for(int i = 0; i < array.length-1; i++)
		{
			for(int j = i + 1; j < array.length; j++)
			{
				int sum = array[i] + array[j];
 				if(sum == targetSum)
				{
					int[] sumArray = new int[] {array[i], array[j]};
					return sumArray;
				}
					
			}
		}
		
    return new int[0];
  }
}
