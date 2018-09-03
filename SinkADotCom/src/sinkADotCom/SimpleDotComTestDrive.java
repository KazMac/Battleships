/**
 * Simple Sink a Dot Com test code
 * Head First Java, chapter 5
 * KM 03/09/18
 */
package sinkADotCom;

public class SimpleDotComTestDrive {

	public static void main(String[] args) {
		
		//Instantiate a SimpleDotCom object
		SimpleDotCom dot = new SimpleDotCom();
		

		//Array containing location of dot com
		int[] locations = {2,3,4};
		
		//Setter method
		dot.setLocationCells(locations);
		
		String userGuess = "3";
		
		// pass guess to checkYourself method
		String result = dot.checkYourself(userGuess);
		
		String testResult = "failed";
		
		if (result.equals("hit"))
		{
			testResult = "passed";
		}
		
		System.out.println(testResult);
	}

}
