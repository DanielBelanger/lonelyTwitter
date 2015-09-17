package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by debelang on 9/16/15.
 */
public class Angry extends Mood {
    public Angry(String mood, Date date) {
        super(mood, date);
    }

    public Angry(String mood) {
        super(mood);
    }

    @Override
    public Boolean isHappy(){
        return Boolean.FALSE;
    }

    @Override
    public String getMood(){
        return ">:(";
    }
}
