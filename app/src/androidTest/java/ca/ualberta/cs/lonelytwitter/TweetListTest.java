package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import junit.framework.TestCase;

import java.util.List;

/**
 * Created by debelang on 9/30/15.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {
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
}