package com.bridgelab;

/**
 * The Mood Analyser application will check the mood if sad or happy
 * @author Antara
 * @since 2021-11-17
 */

public class MoodAnalyser {
    private String message;
    MoodAnalyser(){}
    public MoodAnalyser(String message){
        this.message = message;
    }
    public String analyseMood() throws MoodAnalyserException{
        try {
            if (this.message.contains("Sad")) {
                return "SAD";
            } else
                return "HAPPY";
        }
        catch (Exception e) {
            if (message.contains(null)) {
                throw new MoodAnalyserException("Invalid Mood",MoodAnalyserException.exception.NULL);
            }
            else
                throw new MoodAnalyserException("Invalid Mood!", MoodAnalyserException.exception.EMPTY);
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyser problem");
    }
}
