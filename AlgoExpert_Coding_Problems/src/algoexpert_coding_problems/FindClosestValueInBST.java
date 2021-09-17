import java.util.*;

//Find closest value in Binary Search Tree problem from AlgoExpert.io
//Self written code with help from the solutions and hints on AlgoExpert.io

public class FindClosestValueInBST {
  public static int findClosestValueInBst(BST tree, int target) {
	
		BST currentNode = tree;
		int closest = tree.value;
		
		
		while(currentNode != null)
		{
			
			if(Math.abs(closest - target) > Math.abs(currentNode.value - target))
			{
				closest = currentNode.value; 
			}
			
			if(target == currentNode.value)
				return currentNode.value;
			
			if(target < currentNode.value)
			{
				currentNode = currentNode.left;
			}
			else if(target > currentNode.value)
			{
				currentNode = currentNode.right;
			}
			
		}
		
		
		
		return closest;
  }
// The part below is written by AlgoExpert.io
  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}
