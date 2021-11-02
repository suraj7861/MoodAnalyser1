package com.moodAnalyser;

public class MoodAnalyser {

	public static void main(String[] args) {
		System.out.println("Welcome To Mood Analyser Program");
		//create object
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		//pass Happy message 
		String message = moodAnalyser.analyseMood("This is Happy message");
		System.out.println(message);
		//pass Sad message 
		message = moodAnalyser.analyseMood("This is Sad message");
		System.out.println(message);
	}
	//check mood whether Happy or Sad
	private String analyseMood(String message) {
		if (message.contains("Sad")) {
			return "Sad";
		} else {
			return "Happy";
		}
	}
}