package cs356.a2;

import cs356.a2.interfaces.Component;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alfredo
 */
public class UserGroup implements Component {
    
    private String groupID;
    private List<Component> members;

    
    public UserGroup() {
        groupID = null;
        members = new ArrayList();
    }
    
    
    public UserGroup(String id) {
        groupID = id;
        members = new ArrayList();
    }
    
    
    // Return group ID
    @Override
    public String getID() {
        return groupID;
    }

    
    // Return number of elements in the members list
    @Override
    public int numberOfLeafs() {
        return members.size();
    }

    
    // Return the list of components
    @Override
    public List<Component> getComps() {
        return members;
    }

    
    // User group is a series of components, so add the new component if it 
    // isn't already in
    @Override
    public void add(Component c) {
        
        if(!members.contains(c)) {
            members.add(c);
        }else {
            
        }
        
    }
            
    
}
