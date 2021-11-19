package com.bridgelab;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void ifMessageContainSad_shouldPass() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I'm in Sad Moood");
        try {
            String mood = moodAnalyser.analyseMood();
            Assert.assertEquals("SAD", mood);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void ifMessageNotContainSad_shouldPass() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I'm in Any Moood");
        try {
            String mood = moodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY", mood);
        }
        catch (MoodAnalyserException e){
            e.printStackTrace();
        }
    }
    @Test
    public void ifGivenMoodIsEmply_shouldPassTest(){
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser("");
            String mood = moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.exception.EMPTY, e.exp);
            e.printStackTrace();
        }
    }
}
