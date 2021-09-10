import java.util.*;

//Code created from AlgoExpert question "Non-Constructible Change".
//With the int[] coins, find the minimum amount of change you cannot create.
//Handwritten code with solution idea from AlgoExpert.io

public class Program {

  public int nonConstructibleChange(int[] coins) {
    
		//Arrays object takes the int array coins and sorts it in nlogn time.
    Arrays.sort(coins);
		
		int ChangeCreated = 0; 
		for(int coin : coins)
		{
			if(coin > ChangeCreated + 1)
			{
				return ChangeCreated + 1;
			}
			
			ChangeCreated += coin; 
		}
		
    return ChangeCreated + 1;
  }
}
