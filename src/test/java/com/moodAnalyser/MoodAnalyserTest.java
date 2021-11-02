package com.moodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	// -----------------test for Happy-----------
	@Test
	public void givenMessageWhenSadShouldBeReturnSad() {
		// create object
		MoodAnalyser moodeAnalyser = new MoodAnalyser();
		// set message
		moodeAnalyser.setMessage("I am in Sad Mood");
		String expectedValue = "SAD";
		String mood = moodeAnalyser.analyseMood();
		Assert.assertEquals(expectedValue, mood);

	}

	// ---------------test for Happy---------------
	@Test
	public void givenMessageWhenHappyShouldBeReturnHappy() {
		// create object
		MoodAnalyser moodeAnalyser = new MoodAnalyser();
		// set message
		moodeAnalyser.setMessage("I am in Happy Mood");
		String expectedValue = "HAPPY";
		String mood = moodeAnalyser.analyseMood();
		Assert.assertEquals(expectedValue, mood);

	}

}