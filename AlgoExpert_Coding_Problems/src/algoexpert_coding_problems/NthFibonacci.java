//Nth Fib problem
//recursive solution with a better time complexity O(N) 
//because of the use of a hash map. Look up time is O(1). 
//We can improve the space complexity by just getting rid of 
//the hash map and using an iterative approach to the problem. 
//Self written code with help from AlgoExpert.io solutions and video
//Joanna B. Vaklin

import java.util.*;

public class Program {
	//this code has a Time Complexity O(N)
	//and Space complexity 0(N)
  public static int getNthFib(int n) {

		//"Memoization is a method used to store the results
		//of previous function calls to speed up future calculations."
		Map<Integer, Integer> memoize = new HashMap<Integer, Integer>();
		
		//The first two numbers in the fib sequence [0,1,...]
		memoize.put(1,0);
		memoize.put(2,1);
		return getNthFib(n, memoize);
		
  }
	
	public static int getNthFib(int n, Map<Integer, Integer> memoize)
	{
		
		if(memoize.containsKey(n))
		{
			return memoize.get(n);
		}
		else
		{
			memoize.put(n, getNthFib(n-1, memoize) + getNthFib(n-2, memoize));
			return memoize.get(n);
		}
		
		
		
	}
}
