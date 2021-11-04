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
	public String analyseMood() throws MoodAnalyserException {
		try {
            if (message.length()==0)
            {
            	throw new MoodAnalyserException("Please enter proper mood",MoodAnalyserException.ExceptionType.ENTERED_EMPTY);
            }
			if (message.contains("Sad")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		}catch(NullPointerException e) {
			throw new MoodAnalyserException("Please enter proper mood",MoodAnalyserException.ExceptionType.ENTERED_NULL);
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome To Mood Analyser Program");

	}
}