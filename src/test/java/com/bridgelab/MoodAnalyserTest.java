package com.bridgelab;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void ifMessageContainSad_shouldPass() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I'm in Sad Moood");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void ifMessageNotContainSad_shouldPass() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I'm in Any Moood");
        Assert.assertEquals("HAPPY", mood);
    }
}
