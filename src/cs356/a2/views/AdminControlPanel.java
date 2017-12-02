package cs356.a2.views;

import cs356.a2.Admin;
import cs356.a2.Admin;
import javafx.scene.input.KeyEvent;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;

/**
 *
 * @author Alfredo
 */
public class AdminControlPanel extends javax.swing.JFrame {
 
    private static Admin admin; // Hold reference to admin 
    private DefaultMutableTreeNode root;
    
    /**
     * Creates new form AdminControlPanel
     */
    public AdminControlPanel() {
        
        root = new DefaultMutableTreeNode("Root");
        initComponents();
        
    }

    // Makes it easy to grab needed info
    public void tieToAdmin(Admin admin){
        this.admin = admin;
    }
    
    
    // Update JTree
    public void updateJTree(DefaultMutableTreeNode n) {
        root.add(n);
        TwitterTree.updateUI();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddUserButton = new javax.swing.JButton();
        UserIDTextField = new javax.swing.JTextField();
        AddGroupButton = new javax.swing.JButton();
        GroupIDTextField = new javax.swing.JTextField();
        OpenUserButton = new javax.swing.JButton();
        UserTotalButton = new javax.swing.JButton();
        GroupTotalButton = new javax.swing.JButton();
        PositivePercentTotal = new javax.swing.JButton();
        MessageTotalButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TwitterTree = new javax.swing.JTree();
        TwitterTree = new JTree(root);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AdminControlPanel");
        setMinimumSize(new java.awt.Dimension(400, 300));

        AddUserButton.setText("Add User");
        AddUserButton.setMaximumSize(new java.awt.Dimension(73, 35));
        AddUserButton.setMinimumSize(new java.awt.Dimension(73, 30));
        AddUserButton.setPreferredSize(new java.awt.Dimension(73, 30));
        AddUserButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddUserButtonMouseClicked(evt);
            }
        });

        UserIDTextField.setText("User ID");
        UserIDTextField.setToolTipText("Type in user ID to be added");
        UserIDTextField.setMinimumSize(new java.awt.Dimension(6, 25));
        UserIDTextField.setPreferredSize(new java.awt.Dimension(59, 25));
        UserIDTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserIDTextFieldMouseClicked(evt);
            }
        });

        AddGroupButton.setText("Add Group");
        AddGroupButton.setToolTipText("Add Group");
        AddGroupButton.setMaximumSize(new java.awt.Dimension(73, 35));
        AddGroupButton.setMinimumSize(new java.awt.Dimension(73, 30));
        AddGroupButton.setPreferredSize(new java.awt.Dimension(73, 30));
        AddGroupButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddGroupButtonMouseClicked(evt);
            }
        });

        GroupIDTextField.setText("Group ID");
        GroupIDTextField.setToolTipText("Group ID to be added");
        GroupIDTextField.setMinimumSize(new java.awt.Dimension(6, 25));
        GroupIDTextField.setPreferredSize(new java.awt.Dimension(59, 25));
        GroupIDTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GroupIDTextFieldMouseClicked(evt);
            }
        });

        OpenUserButton.setText("Open User View");
        OpenUserButton.setToolTipText("Opens user view");
        OpenUserButton.setMaximumSize(new java.awt.Dimension(109, 25));
        OpenUserButton.setMinimumSize(new java.awt.Dimension(109, 25));
        OpenUserButton.setPreferredSize(new java.awt.Dimension(109, 25));
        OpenUserButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OpenUserButtonMouseClicked(evt);
            }
        });

        UserTotalButton.setText("Show User Total");
        UserTotalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserTotalButtonActionPerformed(evt);
            }
        });

        GroupTotalButton.setText("Show Group Total");
        GroupTotalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GroupTotalButtonActionPerformed(evt);
            }
        });

        PositivePercentTotal.setText("Show Positive Percentage");
        PositivePercentTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PositivePercentTotalActionPerformed(evt);
            }
        });

        MessageTotalButton.setText("Show Message Total");

        TwitterTree.setShowsRootHandles(true);
        jScrollPane2.setViewportView(TwitterTree);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserIDTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GroupIDTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AddGroupButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(OpenUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UserTotalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GroupTotalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MessageTotalButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PositivePercentTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddGroupButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GroupIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(OpenUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(UserTotalButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GroupTotalButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MessageTotalButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PositivePercentTotal))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserTotalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserTotalButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserTotalButtonActionPerformed

    private void GroupTotalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GroupTotalButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GroupTotalButtonActionPerformed

    private void PositivePercentTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PositivePercentTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PositivePercentTotalActionPerformed

    private void OpenUserButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpenUserButtonMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_OpenUserButtonMouseClicked

    private void UserIDTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserIDTextFieldMouseClicked
        UserIDTextField.setText("");
        GroupIDTextField.setText("Group ID");
    }//GEN-LAST:event_UserIDTextFieldMouseClicked

    private void GroupIDTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GroupIDTextFieldMouseClicked
        GroupIDTextField.setText("");
        UserIDTextField.setText("User ID");
    }//GEN-LAST:event_GroupIDTextFieldMouseClicked

    
    // Takes text from text field to create new user
    private void AddUserButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddUserButtonMouseClicked
        String newUser = UserIDTextField.getText();
        admin.createUser(newUser);
        System.out.println("inputted username: " + newUser);
        UserIDTextField.setText("");
    }//GEN-LAST:event_AddUserButtonMouseClicked

    private void AddGroupButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddGroupButtonMouseClicked
        // TODO add your handling code here:
        String newGroup = GroupIDTextField.getText();
        admin.createGroup(newGroup);
        System.out.println("inputted group name " + newGroup);
        GroupIDTextField.setText("");
    }//GEN-LAST:event_AddGroupButtonMouseClicked

   
    public static void run(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminControlPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddGroupButton;
    private javax.swing.JButton AddUserButton;
    private javax.swing.JTextField GroupIDTextField;
    private javax.swing.JButton GroupTotalButton;
    private javax.swing.JButton MessageTotalButton;
    private javax.swing.JButton OpenUserButton;
    private javax.swing.JButton PositivePercentTotal;
    private javax.swing.JTree TwitterTree;
    private javax.swing.JTextField UserIDTextField;
    private javax.swing.JButton UserTotalButton;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
