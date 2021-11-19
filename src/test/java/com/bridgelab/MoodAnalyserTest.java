package com.bridgelab;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void ifMessageContainSad_shouldPass() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I'm in Sad Moood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void ifMessageNotContainSad_shouldPass() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I'm in Any Moood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
    @Test
    public void ifGivenMoodIsNULL_Should_Return_HAPPY() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
}
