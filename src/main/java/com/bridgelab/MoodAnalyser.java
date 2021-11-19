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
    public String analyseMood(){
        try {
            if (this.message.contains("Sad")) {
                return "SAD";
            } else
                return "HAPPY";
        }
        catch (Exception e) {
            return "HAPPY";
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyser problem");
    }
}
