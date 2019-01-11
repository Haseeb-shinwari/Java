
package Front;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class LoginForm extends javax.swing.JFrame {
  
    
    
    public LoginForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUserName = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jCheckBoxShowPass = new javax.swing.JCheckBox();
        jButton1Cancel = new javax.swing.JButton();
        jButton2Login = new javax.swing.JButton();
        jLabel4CreateAccount = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 51));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabelMn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMn.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMn.setText("-");
        jLabelMn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMnMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addComponent(jLabelMn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelClose)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClose)
                    .addComponent(jLabelMn)
                    .addComponent(jLabel3))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 110, 100, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("UserName:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 50, 100, 30);

        jTextFieldUserName.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldUserName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jTextFieldUserName);
        jTextFieldUserName.setBounds(120, 50, 160, 30);

        jPasswordField1.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jPasswordField1);
        jPasswordField1.setBounds(120, 110, 160, 30);

        jCheckBoxShowPass.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBoxShowPass.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxShowPass.setText("Show Password");
        jCheckBoxShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxShowPassActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBoxShowPass);
        jCheckBoxShowPass.setBounds(290, 110, 100, 30);

        jButton1Cancel.setBackground(new java.awt.Color(204, 0, 0));
        jButton1Cancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1Cancel.setForeground(new java.awt.Color(204, 204, 255));
        jButton1Cancel.setText("Cancel");
        jButton1Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CancelActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1Cancel);
        jButton1Cancel.setBounds(120, 160, 80, 30);

        jButton2Login.setBackground(new java.awt.Color(153, 102, 255));
        jButton2Login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2Login.setForeground(new java.awt.Color(204, 204, 255));
        jButton2Login.setText("Login");
        jButton2Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2LoginActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2Login);
        jButton2Login.setBounds(220, 160, 80, 30);

        jLabel4CreateAccount.setBackground(new java.awt.Color(255, 153, 0));
        jLabel4CreateAccount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4CreateAccount.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4CreateAccount.setText("Create Account !");
        jLabel4CreateAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4CreateAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4CreateAccountMouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4CreateAccount);
        jLabel4CreateAccount.setBounds(120, 200, 110, 20);

        jPanel3.setLayout(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMnMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
        
    }//GEN-LAST:event_jLabelMnMouseClicked

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jCheckBoxShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxShowPassActionPerformed
        // TODO add your handling code here:
        if(jCheckBoxShowPass.isSelected()){
           jPasswordField1.setEchoChar((char)0);
        }else{
             jPasswordField1.setEchoChar('*');
        }
        
    }//GEN-LAST:event_jCheckBoxShowPassActionPerformed

    private void jButton1CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1CancelActionPerformed

    private void jLabel4CreateAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4CreateAccountMouseClicked
        // TODO add your handling code here:
        SignupForm supf=new SignupForm();
        supf.setVisible(true);
        supf.pack();
        supf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.dispose();
    }//GEN-LAST:event_jLabel4CreateAccountMouseClicked

    private void jButton2LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2LoginActionPerformed
        
        Connection con=myConnection.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps =con.prepareStatement("SELECT `userName`,`password`,id  FROM `user` WHERE `userName` = ? AND `password`= ? ");
           ps.setString(1, jTextFieldUserName.getText());
           ps.setString(2,String.valueOf( jPasswordField1.getPassword()));
           rs=ps.executeQuery();
           if(rs.next()){
               // get the current user id 
               
               MyContactForm.currentUserId=rs.getInt("id");
                System.out.println(rs.getInt("id")+"From Login");
                
                MyContactForm mcf=new MyContactForm();
                mcf.setVisible(true);
                mcf.pack();
                mcf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mcf.jLabel2UserName.setText(rs.getString(1));
                
                this.dispose();
           }else{
               JOptionPane.showMessageDialog(null,"Login Error");
           }
        
        } catch (SQLException ex) {
            System.out.println(" Error");
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2LoginActionPerformed

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged

     
    
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanel2MousePressed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Cancel;
    private javax.swing.JButton jButton2Login;
    private javax.swing.JCheckBox jCheckBoxShowPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4CreateAccount;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
}
