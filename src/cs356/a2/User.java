package cs356.a2;

import cs356.a2.interfaces.Component;
import cs356.a2.interfaces.Observer;
import cs356.a2.interfaces.Subject;
import cs356.a2.views.UserControlPanel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alfredo
 * Each User is both an observer of the Users its following and a subject to the
 * Users following it, it has to hold onto references to both the Users it's
 * following and the Users following it. It has to update followers when a new
 * message is posted and updated when a user its following posts as well.
 */
public class User implements Subject, Observer, Component {
    
    private String ID;
    private List<Subject> following;
    private List<Observer> followers;
    private List<String> tweets; // What the followers are "watching"
    private List<String> newsFeed; // This is what gets update for each follower
    private UserControlPanel view;
    
    
    public User(String ID) {
        System.out.println("User created: " + ID); //delete
        this.ID = ID;
        followers = new ArrayList();
        following = new ArrayList();
        tweets = new ArrayList();
        view = new UserControlPanel();
    }
    
    
    public List<Subject> getFollowing() {
        return following;
    }
    
    
    public List<Observer> getFollowers() {
        return followers;
    }
    
    
    public List<String> getTweets() {
        return tweets;
    }
    
    
    public List<String> getNewsFeed() {
        return newsFeed;
    }
    
    
    public void initUserPanel() {
        view.setVisible(true);
    }
    
    
    // User types in new messages, saved to list of tweets and sent to observers
    public void newTweet(String tweet){
        tweets.add(tweet);
        notifyObservers(tweet);
    }

    
    
    
    // User I'm following posted new message, add it to my news feed
    @Override
    public void update(String msg) {
        newsFeed.add(msg);
    }

    
    // Add observer to list of followers
    @Override
    public void attachObserver(Observer o) {
        if(!followers.contains(o)) { // Check if observer already observing
            followers.add(o);
        } else {
            // Do nothing
        }
    }

    
    // Tell observers about new messages
    @Override
    public void notifyObservers(String msg) {
        
        for(Observer o : followers) {
            o.update(msg);
        }

    }

    @Override
    public String getID() {
        return ID;
    }

    
    // Since Users can be thought of as "leafs" in the component design pattern
    // and all users have to be counted, User objects will return 1 in. This is
    // implemented in order to count all the Users in the system.
    @Override
    public int numberOfLeafs() {
        return 1;
    }

    
    // Users are leafs, so they hold no other components
    @Override
    public List<Component> getComps() {
        return null;
    }

    
    // Users are leafs, so they do not have to add anything
    public void add(Component c) { }
    
    
}
