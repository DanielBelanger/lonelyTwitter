package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by debelang on 9/16/15.
 */
public class Happy extends Mood {
    public Happy(String mood, Date date) {
        super(mood, date);
    }

    public Happy(String mood) {
        super(mood);
    }

    @Override
    public Boolean isHappy(){
        return Boolean.TRUE;
    }

    @Override
    public String getMood(){
        return ":D";
    }
}
