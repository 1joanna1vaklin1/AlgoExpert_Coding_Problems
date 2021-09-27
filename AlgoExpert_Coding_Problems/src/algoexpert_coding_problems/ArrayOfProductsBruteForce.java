//Brute Force Approach of the Array of Products problem 
//from AlgoExpert.io
//Joanna B. Vaklin

import java.util.*;

public class ArrayOfProductsBruteForce {
  public int[] arrayOfProducts(int[] array) {
    
		int product = 1; 
		int[] productArray = new int[array.length]; 
		
		for(int i = 0; i < array.length; i++)
		{
			product = 1;
			for(int j = 0; j < array.length; j++)
			{
				if(i == j)
					continue;
				
				product *= array[j];		
			}
			productArray[i] = product;
		}
		
    return productArray;
  }
}
