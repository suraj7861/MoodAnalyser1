package com.moodAnalyser;

public class MoodAnalyser {

	// variable declaration
	public String message;

	// default constructor
	public MoodAnalyser() {
		message = null;
	}

	// parameterized constructor
	public MoodAnalyser(String message) {
		this.message = message;
	}

	// setter
	public void setMessage(String message) {
		this.message = message;
	}

	// check mood whether Happy or Sad
	public String analyseMood() {
		try {
		if (message.contains("Sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
		}catch(NullPointerException e) {
			return null;
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome To Mood Analyser Program");

	}
}