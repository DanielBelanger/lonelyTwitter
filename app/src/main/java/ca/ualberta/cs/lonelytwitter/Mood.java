package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by debelang on 9/16/15.
 */
public abstract class Mood {
    private String mood;
    private Date date;

    //if both mood and date are given
    public Mood(String mood, Date date) {
        this.setMood(mood);
        this.date = date;
    }

    //if no date is given
    public Mood(String mood) {
        this.setMood(mood);
        this.date = new Date();
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract Boolean isHappy();
}
