/**
 * sinkADotCom class for Simple Sink a Dot Com game 
 * Head First Java, chapter 5
 * KM 03/09/18
 */
package sinkADotCom;

public class SimpleDotCom {
	int[] locationCells;
	int numHits=0;
	
	void setLocationCells(int[] locs)
	{
		locationCells = locs;
	}
	
	public String checkYourself(String stringGuess)
	{
		//Convert guess from a string to an int
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		
		for (int cell : locationCells)
		{
			if (guess == cell)
			{
				result = "hit";
				numHits++;
				break;
			}
		}
		
		if (numHits == locationCells.length)
		{
			result = "kill";
		}
		System.out.println(result);
		return result;
	}
	
}
