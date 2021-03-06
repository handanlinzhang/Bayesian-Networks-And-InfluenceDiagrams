
/*
 * LinkNodeProperty.java
 *
 */

package GUI;
import java.util.ArrayList;
import java.util.Collections;

public class UpdateLinkNodeProperty extends javax.swing.JDialog {

UpdateLinkNode par;
ArrayList statelist;
ArrayList objList = new ArrayList();
InfluenceGUI root;
    /** Creates new form NodeProperty */
    public UpdateLinkNodeProperty(UpdateLinkNode parent,InfluenceGUI root, boolean modal) {
        initComponents();
        par=parent;
        this.setLocationRelativeTo(null);
        this.root=root;
        statelist=new ArrayList();
        ArrayList items = new ArrayList();
        
        for(int i=0;i<root.nodes.size();i++)
        {
            if(((ShapeNode)root.nodes.get(i)).node.type==node_type.LINK_NODE || 
                ((ShapeNode)root.nodes.get(i)).node.type==node_type.MODEL_LINK_NODE ||
                    ((ShapeNode)root.nodes.get(i)).node.type==node_type.UPDATE_LINK_NODE)
            continue;
            ShapeNode sn = (ShapeNode)root.nodes.get(i);
            
           items.add(sn.getFullName());
           objList.add(sn);
            
            
        }
       // Collections.sort(items);
       // Collections.sort(objList);
        for(Object str: items){
            
            parentNameCombo.addItem((String)str);
            childNameCombo.addItem((String)str);
        }
        nodeNameField.setText(par.node.name);
        kindTextField.setText(par.node.type.toString());
    if(par.parent !=null && par.child!=null)
    {
            parentNameCombo.select(par.parent.node.name+par.parent.node.getNodeId());
            childNameCombo.select(par.child.node.name+par.child.node.getNodeId());
    }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parentNameCombo = new java.awt.Choice();
        childNameCombo = new java.awt.Choice();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        makeLinkButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        nodeNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kindTextField = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Linker Property Dialog");

        parentNameCombo.setBackground(java.awt.Color.white);

        childNameCombo.setBackground(java.awt.Color.white);

        jLabel1.setText("Parent Node");

        jLabel2.setText("Child Node");

        makeLinkButton.setText("Make Link");
        makeLinkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeLinkButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        nodeNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nodeNameFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Node name");

        jLabel4.setText("Kind");

        kindTextField.setEditable(false);

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(parentNameCombo, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(kindTextField)
                            .addComponent(nodeNameField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(childNameCombo, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(okButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(makeLinkButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelButton, makeLinkButton, okButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nodeNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(kindTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(parentNameCombo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jLabel2)
                    .addComponent(childNameCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(makeLinkButton)
                    .addComponent(cancelButton)
                    .addComponent(okButton))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void makeLinkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeLinkButtonActionPerformed
        // TODO add your handling code here:
        
      
      ShapeNode prnt=(ShapeNode)root.nodes.get(root.nodes.indexOf(objList.get(parentNameCombo.getSelectedIndex())));
      ShapeNode chld=(ShapeNode)root.nodes.get(root.nodes.indexOf(objList.get(childNameCombo.getSelectedIndex())));
      par.makeLink(prnt,chld);
      this.dispose();
    }//GEN-LAST:event_makeLinkButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void nodeNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nodeNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nodeNameFieldActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        // TODO add your handling code here:
        par.node.name=nodeNameField.getText();
         par.repaint();
        this.dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    /**
    * @param args the command line arguments
    */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private java.awt.Choice childNameCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField kindTextField;
    private javax.swing.JButton makeLinkButton;
    private javax.swing.JTextField nodeNameField;
    private javax.swing.JButton okButton;
    private java.awt.Choice parentNameCombo;
    // End of variables declaration//GEN-END:variables

}
