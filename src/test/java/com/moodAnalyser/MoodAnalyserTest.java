package com.moodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenMessageWhenSadShouldBeReturnSad() {
		// create object
		MoodAnalyser moodeAnalyser = new MoodAnalyser();
		// pass Sad message
		String message = "I am in Sad Mood";
		String expectedValue = "SAD";
		String mood = moodeAnalyser.analyseMood(message);
		Assert.assertEquals(expectedValue, mood);

	}

}