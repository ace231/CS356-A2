package cs356.a2.interfaces;

/**
 * Observer interface to be implemented by all Users. In this context,
 * all Users are bother Observers and Subjects
 */

public interface Observer {
    
    public void update(String msg);
    
}
