package com.bridgelab;

public class MoodAnalyserException extends Exception{
    public enum exception{
        NULL,EMPTY;
    }
    public exception exp;
    public MoodAnalyserException(String msg, exception exp){
        super(msg);
    }
}
