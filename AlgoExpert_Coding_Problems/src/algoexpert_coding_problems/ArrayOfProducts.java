//Array of Products Problem from AlgoExpert.io
//Return an int array that contains the product of 
//every number besides the indexed one.
//Self written code with help from AlgoExpert solutions and videos. 
//Joanna B. Vaklin 

import java.util.*;

public class ArrayOfProducts {
  public int[] arrayOfProducts(int[] array) {
    
		int [] left = new int[array.length];
		int [] right = new int[array.length];
		
		Arrays.fill(left, 1); 
		Arrays.fill(left, 1);
		int product = 1;
		
		for(int i = 0; i < array.length; i++)
		{
			left[i] = product;
			product *= array[i];
		}
	  
		product = 1; 
	  
		for(int j = array.length-1; j >= 0; j--)
		{
			right[j] = product;
			product *= array[j];
		}
		
		for(int i = 0; i < array.length; i++)
		{
			products[i] = right[i] * left[i];
		}
		
		
    return products;
  }
}
