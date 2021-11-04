package com.moodAnalyser;

public class MoodAnalyserException extends Exception  {
	//variable declare and assign
	enum ExceptionType {ENTERED_NULL, ENTERED_EMPTY}
	ExceptionType type;
	
	//field constructor
	public MoodAnalyserException(String mood, ExceptionType type) {
		super(mood);
		this.type = type;
	}
}
