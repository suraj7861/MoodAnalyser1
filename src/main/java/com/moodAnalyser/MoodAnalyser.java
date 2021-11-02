package com.moodAnalyser;

public class MoodAnalyser {

	// check mood whether Happy or Sad
	public String analyseMood(String message) {
		if (message.contains("Sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome To Mood Analyser Program");
	}
}