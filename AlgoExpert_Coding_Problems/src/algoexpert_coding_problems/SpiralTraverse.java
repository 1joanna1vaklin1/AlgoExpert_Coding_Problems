//Spiral Traverse problem from AlgoExpert.io
//Self written code with help from AlgoExpert.io solutions and video
//Joanna B. Vaklin


import java.util.*;

public class SpiralTraverse {
  public static List<Integer> spiralTraverse(int[][] array) {
	
		List<Integer> spiralArray = new ArrayList<Integer>();
		
		if(array.length == 0)
			return spiralArray;

		
		int startRow = 0;
		int startCol = 0;
		int endRow = array.length-1;
		int endCol = array[0].length-1;
		
		
		//We see that the sR and eR are each inching towards each other
		//at each iteration. Same with the sC and sR. So when they 
		//overlap each other, that is when we will stop the loop. Because of
		//the case of a rectangular shape, we must include the "equal to" operator. 
		while(startRow <= endRow && startCol <= endCol)
		{
			for(int i = startCol; i <= endCol; i++)
			{
				spiralArray.add(array[startRow][i]);
			}
			for(int i = startRow+1; i <= endRow; i++)
			{
				spiralArray.add(array[i][endCol]);
			}
			for(int i = endCol-1; i >= startCol; i--)
			{
				if(startRow==endRow)
					break;
				spiralArray.add(array[endRow][i]);
			}
			for(int i = endRow-1; i > startRow; i--)
			{
				if(startCol==endCol)
					break;
				spiralArray.add(array[i][startCol]);
			}
			
			startRow++;
			startCol++;
			endCol--;
			endRow--;
			
			
		}

		
		return spiralArray;
  }
}
