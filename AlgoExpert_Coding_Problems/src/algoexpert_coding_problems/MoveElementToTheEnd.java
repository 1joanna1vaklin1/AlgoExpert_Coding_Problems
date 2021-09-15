import java.util.*;

//Move all instances of a specific element to the end of the input array.
//Problem from AlgoExpert.io
//It is performed "in place" and doesn't neccesarily maintain order of the other ints. 
//O(N) time complexity, 0(1) space complexity.
//Self written code with help from AlgoExpert hints and solutions.
//Joanna B. Vaklin

public class MoveElementToTheEnd {
  public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
		
		int left = 0;
		int right = array.size()-1; 
		
		while(left < right)
		{
			if(array.get(left) == toMove && array.get(right) == toMove)
			{
				right--;
			}
			else if(array.get(left) == toMove && array.get(right) != toMove)
			{
				array.set(left, array.get(right));
				array.set(right, toMove);
				right--;
				left++;
			}
			else
			{
				left++;
			}
		}
		
		return array;
  }
}
