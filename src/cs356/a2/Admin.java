package cs356.a2;

import cs356.a2.views.AdminControlPanel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;

/**  
 * The Singleton pattern was implemented for this class since
 * there should only be a single Admin instance in this system.
 * The single Admin instance also instantiates the Admin Control panel
*/

public class Admin {
    protected static Admin instance = null;
    private static  AdminControlPanel adminPanel;
    private static List<User> users;
    private static List<UserGroup> groups;
    
    protected Admin() { }
    
    
    public static Admin getInstance(){
        if (instance == null){
            
            synchronized(Admin.class) {
                
                if(instance == null) {
                    instance = new Admin();
                    users = new ArrayList();
                    groups = new ArrayList();
                    adminPanel = new AdminControlPanel();
                    adminPanel.tieToAdmin(instance);
                    adminPanel.setVisible(true);
                }
                
            }
            
        }
        return instance;
    }
    
    
    // Check if user already exists, if so notify; if not, add user and update
    // tree
    public void createUser(String id) {
        
        for(User u : users) {
            if(u.getID().equals(id)) {
                JOptionPane.showMessageDialog(null, "This username is already taken", "User exists", JOptionPane.PLAIN_MESSAGE);
                return;
            }
        }
        
        users.add(new User(id));
        updateTree(new User(id));
    }
    
    
    public void createGroup(String id) {
        
        for(UserGroup g : groups) {
            if(g.getID().equals(id)) {
                JOptionPane.showMessageDialog(null, "This group name is already taken", "Group exists", JOptionPane.PLAIN_MESSAGE);
                return;
            }
        }
        
        groups.add(new UserGroup(id));
        updateTree(new UserGroup(id));
        
    }
    
    // Following methods are overloaded so that the tree is updated according
    // to whether a user or group or was created. This way a group can be added
    // to the JTree as an expandable element.
    public void updateTree(User u){
        adminPanel.updateJTree(new DefaultMutableTreeNode(u.getID()));
    }
    
    public void updateTree(UserGroup g) {
        DefaultMutableTreeNode newGroup = new DefaultMutableTreeNode(g.getID());
        newGroup.add(new DefaultMutableTreeNode());
        adminPanel.updateJTree(newGroup);
    }
    
    
}
