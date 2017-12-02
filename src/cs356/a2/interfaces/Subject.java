package cs356.a2.interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject interface that will be implemented by all Users
 */

public interface Subject {
    
    public void attachObserver(Observer o);
    
    public void notifyObservers(String msg);
    
}
