/**
 * Simple Sink a Dot Com game
 * Head First Java, chapter 5
 * KM 03/09/18
 */
package sinkADotCom;

public class SimpleDotComGame {

	public static void main(String[] args) {

		int numGuesses = 0;
		//class contains method for getting user input
		GameHelper helper = new GameHelper();
		
		//Make the dot com object
		SimpleDotCom theDotCom = new SimpleDotCom();

		int randomNum = (int) (Math.random()*5);
		int[] locations = {randomNum, randomNum+1, randomNum+2};
		theDotCom.setLocationCells(locations);
		boolean isAlive = true;
		
		while(isAlive == true)
		{
			String guess = helper.getUserInput("Enter a number");
			String result = theDotCom.checkYourself(guess);
			numGuesses ++;
			
			if (result.equals("kill"))
			{
				isAlive = false;
				System.out.println("You took " + numGuesses + " guesses");
			}
		}
	}

}
