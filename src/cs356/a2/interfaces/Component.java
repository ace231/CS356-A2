package cs356.a2.interfaces;

import java.util.List;

/**
 *
 * @author Alfredo
 */
public interface Component {
    
    public String getID();
    
    public int numberOfLeafs();
    
    public List<Component> getComps();
    
    public void add(Component c);
}
