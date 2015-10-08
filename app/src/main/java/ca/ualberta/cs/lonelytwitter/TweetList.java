package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by debelang on 9/30/15.
 */
public class TweetList implements MyObservable {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    private ArrayList<MyObserver> myObservers = new ArrayList<MyObserver>();



    public void add(Tweet tweet) throws IllegalArgumentException{
        if (tweets.contains(tweet)){
            throw new IllegalArgumentException("This tweet already exists");
        }else {
            tweets.add(tweet);
            notifyObservers();
        }
    }

    public void removeTweet(Tweet tweet){
        tweets.remove(tweet);
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public List getTweets(){
        return tweets;
    }

    public int getCount(){
        return tweets.size();
    }

    public void addObserver(MyObserver observer){
        myObservers.add(observer);
    }

    public void notifyObservers(){
        for(MyObserver observer : myObservers){
            observer.myNotify();
        }
    }
}
