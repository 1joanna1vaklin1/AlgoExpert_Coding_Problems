//Kadane's Algorithm
//Self written code with help from AlgoExpert.io
//Joanna B. Vaklin

import java.util.*;

public class KadanesAlgorithm {
  public static int kadanesAlgorithm(int[] array) {

		//Have to use a long because the min value when added to a negative,
		//exceeds the size limit of an int data type. So it returns a postive 
		//number. 
		//or you can just make your life easier and do this code starting
		//at array[1] and then comparing it to the previous...
		long maxValue = Integer.MIN_VALUE; 
		long previousMaxValue = Integer.MIN_VALUE; 
		
		for(int currentValue : array)
		{
			previousMaxValue = Math.max(currentValue, (currentValue + previousMaxValue));
			maxValue = Math.max(previousMaxValue, maxValue);
		}
		
		//must convert it back to an int
		return Math.toIntExact(maxValue);
  }
}
