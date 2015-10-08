package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by debelang on 9/30/15.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 implements MyObserver {
    private boolean wasNotified = false;
    private ArrayList<MyObserver> myObservers = new ArrayList<MyObserver>();



    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testRemoveTweet(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("hihihi");
        tweetList.add(tweet);
        tweetList.removeTweet(tweet);
        assertFalse(tweetList.hasTweet(tweet));
    }

    public void testHasTweet(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("hihihi");
        assertFalse(tweetList.hasTweet(tweet));
        tweetList.add(tweet);
        assertTrue(tweetList.hasTweet(tweet));
    }

    public void testAddTweet(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("hihihi");
        tweetList.add(tweet);
        assertTrue(tweetList.hasTweet(tweet));
    }

    public void testGetCount(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("hihihi");
        tweetList.add(tweet);
        int count = tweetList.getCount();
        assertTrue(count == 1);

    }

    public void testGetTweet(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("hihihi");
        tweetList.add(tweet);
        Tweet returnedTweet = tweetList.getTweet(0);
        assertTrue((tweet.date.equals(returnedTweet.date)) && (tweet.getText().equals(returnedTweet.getText())));

    }

    public void testGetTweetType(){

    }

    private ArrayList<MyObservable> observables = new ArrayList<MyObservable>();
    public void addObservable(MyObservable myObservable){

    }

    public void testAddThrowsException(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("hihihi");
        tweetList.add(tweet);
        try{
            tweetList.add(tweet);
        }catch(IllegalArgumentException e){}
        assertTrue(tweetList.getCount()==1);
    }

    public void testGetTweets(){
        TweetList tweetList = new TweetList();
        List newList = tweetList.getTweets();
        assertTrue(newList != null);

    }

    public void testTweetListChanged(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("hihihi");
        tweetList.addObserver(this);
        wasNotified = false;
        assertFalse(wasNotified);
        tweetList.add(tweet);
        assertTrue(wasNotified);
    }

    public void myNotify(){
        wasNotified = true;
    }


}