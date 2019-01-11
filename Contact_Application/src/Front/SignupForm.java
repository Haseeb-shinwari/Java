
package Front;
import static com.sun.org.apache.xerces.internal.util.Status.SET;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import static jdk.nashorn.internal.runtime.PropertyDescriptor.SET;
public class SignupForm extends javax.swing.JFrame {
     
      
    public SignupForm () {
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
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUserName = new javax.swing.JTextField();
        jPasswordField1Re_enter = new javax.swing.JPasswordField();
        jButton1Cancel = new javax.swing.JButton();
        jLabel4LoginFormVisit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField4 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jButton2Create = new javax.swing.JButton();
        jTextFieldFirstName1 = new javax.swing.JTextField();
        jTextFieldLastName1 = new javax.swing.JTextField();

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
        jLabel3.setText("Signup Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FirstName:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 40, 100, 30);

        jTextFieldUserName.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldUserName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserNameActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldUserName);
        jTextFieldUserName.setBounds(130, 180, 160, 30);

        jPasswordField1Re_enter.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordField1Re_enter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jPasswordField1Re_enter);
        jPasswordField1Re_enter.setBounds(130, 310, 160, 30);

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
        jButton1Cancel.setBounds(110, 390, 80, 30);

        jLabel4LoginFormVisit.setBackground(new java.awt.Color(255, 153, 0));
        jLabel4LoginFormVisit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4LoginFormVisit.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4LoginFormVisit.setText("Already Have Account !");
        jLabel4LoginFormVisit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4LoginFormVisit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4LoginFormVisitMouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4LoginFormVisit);
        jLabel4LoginFormVisit.setBounds(120, 500, 160, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("UserName:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 180, 100, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("LastName:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 110, 100, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 240, 100, 30);

        jPasswordField4.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField4ActionPerformed(evt);
            }
        });
        jPanel2.add(jPasswordField4);
        jPasswordField4.setBounds(130, 240, 160, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Re-Enter:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 310, 100, 30);

        jButton2Create.setBackground(new java.awt.Color(153, 102, 255));
        jButton2Create.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2Create.setForeground(new java.awt.Color(204, 204, 255));
        jButton2Create.setText("Create");
        jButton2Create.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2CreateActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2Create);
        jButton2Create.setBounds(220, 390, 80, 30);

        jTextFieldFirstName1.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldFirstName1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldFirstName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFirstName1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldFirstName1);
        jTextFieldFirstName1.setBounds(130, 40, 160, 30);

        jTextFieldLastName1.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldLastName1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldLastName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLastName1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldLastName1);
        jTextFieldLastName1.setBounds(130, 110, 160, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jButton1CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CancelActionPerformed

        System.exit(0);
        
    }//GEN-LAST:event_jButton1CancelActionPerformed

    private void jLabel4LoginFormVisitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4LoginFormVisitMouseClicked
        // TODO add your handling code here:
        LoginForm logf=new LoginForm();
        logf.setVisible(true);
        logf.pack();
        logf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel4LoginFormVisitMouseClicked
    public boolean isUsernameExist(String un){
        boolean uExist=false;
        Connection con=myConnection.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps =con.prepareStatement("SELECT * FROM  `user` WHERE `userName` = ? ");
      
            ps.setString(1, jTextFieldUserName.getText());
           
           rs=ps.executeQuery();
           if(rs.next()){
                 uExist=true;
           }
        
        } catch (SQLException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return uExist;
        
    }
    public boolean verifyData(){
      // if (username - first name -last name -password) are empty 
        if(jTextFieldFirstName1.getText().equals("") && jTextFieldLastName1.getText().equals("")
                ||jTextFieldUserName.getText().equals("")
                || String.valueOf(jPasswordField4.getPassword()).equals(""))
        {
            JOptionPane.showMessageDialog(null," One or More Field Are Empty ");
            return false;
            
        }
        // if pass1 is different from pass2
        
        else if(!String.valueOf(jPasswordField4.getPassword()).equals(String.valueOf(jPasswordField1Re_enter.getPassword()))){
            JOptionPane.showMessageDialog(null," Incorrect Password ");
               return false;
        }
       
          // else everything is ok 
        else{
            
               return true;
        }
        
    }

    private void jButton2CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2CreateActionPerformed
          //TODO add your handling code here:
         if(verifyData()){
               Connection con= myConnection .getConnection();
         PreparedStatement ps;
       // rs=stmt.executeQuery(SQL);
         try { 
            
            ps=con.prepareStatement("INSERT INTO `user`(  `firstName`, `lastName`, `userName` ,`password`) VALUES(?,?,?,?) ");
            ps.setString(1,  jTextFieldFirstName1.getText());
            ps.setString(2,   jTextFieldLastName1.getText());
            ps.setString(3,  jTextFieldUserName.getText());
            ps.setString(4,  String.valueOf( jPasswordField4.getPassword())); 
           
            if(isUsernameExist(jTextFieldUserName.getText())){
                    JOptionPane.showMessageDialog(null, "User name already exit");
            }else{
                   if(ps.executeUpdate() !=0){
                   JOptionPane.showMessageDialog(null, "Account Created");
               }else{
          JOptionPane.showMessageDialog(null, "Somthing Wrong");
                   }
         }    
        } catch (Exception ex) {
            
            System.out.println("err");
            Logger.getLogger(SignupForm.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
       
         
         
    }//GEN-LAST:event_jButton2CreateActionPerformed

    private void jTextFieldUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserNameActionPerformed

    private void jTextFieldFirstName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFirstName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFirstName1ActionPerformed

    private void jTextFieldLastName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLastName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLastName1ActionPerformed

    private void jPasswordField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField4ActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupForm ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Cancel;
    private javax.swing.JButton jButton2Create;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel4LoginFormVisit;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1Re_enter;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JTextField jTextFieldFirstName1;
    private javax.swing.JTextField jTextFieldLastName1;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
}
