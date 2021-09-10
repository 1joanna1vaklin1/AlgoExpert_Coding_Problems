
package algoexpert_coding_problems;
import java.util.*;

/**
 * Problem on AlgoExpert called Tournament winners. A program that takes a competitions nested arraylist and a result arraylist. 
 * @author joannavaklin
 */
public class TournamentWinner {
    
    
//This program utilizes the HashMap with a string as the key and 
//an integer as the value. 

  public String tournamentWinner(
      ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
		
		String highestScoreTeam = "";
		int HomeTeamWon = 1; 
		int awayTeamWon = 0; 
		
		HashMap<String, Integer> scores = new HashMap<String, Integer>();
		scores.put(highestScoreTeam, 0);
		
		for(int i = 0; i < results.size(); i++)
		{
			int result = results.get(i);
			ArrayList<String> currentPlayers = competitions.get(i);
			

			String winner = (result == HomeTeamWon) ? currentPlayers.get(0) : currentPlayers.get(1); 
			
			updateScores(winner, 3, scores);
			
			//get method in the hash map returns the value of specified key.
			if(scores.get(winner) > scores.get(highestScoreTeam))
			{
				highestScoreTeam = winner;
			}
			
		}
		
		
		return highestScoreTeam; 
  }
	
	public static void updateScores(String winner, int points, HashMap<String, Integer> scores)
	{
		//Need to check if it already contains it so can add one because if 
		//a team is not added yet and we do the "scores.get(team) + points"
		//operation, we would get an error. 
		if(!scores.containsKey(winner))
			scores.put(winner, 0);
		
		scores.put(winner, scores.get(winner) + points);
		
	}
}

    

