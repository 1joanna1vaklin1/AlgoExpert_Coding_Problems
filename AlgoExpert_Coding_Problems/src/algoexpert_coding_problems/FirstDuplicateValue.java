//First duplicate value problem from AlgoExpert.io
//All values in an array are from 1 to n, n being the size of the array
//return the first duplicate value
//Code self written by me with help from AlgoExpert videos, solutions, and hints
//O(N) time complexity O(1) Space Complexity
//Joanna B. Vaklin 

import java.util.*;

public class FirstDuplicateValue {

  public int firstDuplicateValue(int[] array) {

		for(int num : array)
		{
			int absValue = Math.abs(num);
			
			if(array[absValue-1] < 0)
				return absValue;
			array[absValue - 1] *= -1;
		}
			
		return -1;
  }
}
