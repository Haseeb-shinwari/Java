/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Authors extends javax.swing.JFrame {

    Connection connection;
    Statement statement;
    ResultSet rs;
    int curRow=0;
    public Authors() {
        initComponents();
        
        connectDB();
    }

    public void connectDB()
    {
        try {
            final String host = "jdbc:derby://localhost:1527/BooksDatabase";
            final String user = "username";
            final String pwd = "admin";
            
            connection = DriverManager.getConnection(host,user,pwd);
            
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            final String select_query = "select* from authors";
            rs = statement.executeQuery(select_query);
            
            rs.next();
            
            String authorID = String.valueOf(rs.getInt(1));
            String first = rs.getString(2);
            String last = rs.getString(3);
            String book = rs.getString(4);
            
            txtID.setText(authorID);
            txtFirstName.setText(first);
            txtLastName.setText(last);
            txtBookTitle.setText(book);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(Authors.this, ex.getMessage());
            Logger.getLogger(Authors.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtBookTitle = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAddNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Book Title");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtID))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBookTitle)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLastName)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(txtFirstName)
                    .addComponent(txtID))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        btnFirst.setText("First");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setText("Last");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPrevious)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirst)
                    .addComponent(btnPrevious)
                    .addComponent(btnNext)
                    .addComponent(btnLast))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAddNew.setText("Add New");
        btnAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.setEnabled(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnUpdate)
                        .addGap(66, 66, 66)
                        .addComponent(btnDelete))
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddNew, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnAddNew))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        try {
            if(rs.next())
            {
            String authorID = String.valueOf(rs.getInt(1));
            String first = rs.getString(2);
            String last = rs.getString(3);
            String book = rs.getString(4);
            
            txtID.setText(authorID);
            txtFirstName.setText(first);
            txtLastName.setText(last);
            txtBookTitle.setText(book);
            }
            else{
            rs.previous();
            JOptionPane.showMessageDialog(Authors.this, "End of File");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(Authors.this, ex.getMessage());
            Logger.getLogger(Authors.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        try {
            if(rs.previous())
            {
            String authorID = String.valueOf(rs.getInt(1));
            String first = rs.getString(2);
            String last = rs.getString(3);
            String book = rs.getString(4);
            
            txtID.setText(authorID);
            txtFirstName.setText(first);
            txtLastName.setText(last);
            txtBookTitle.setText(book);
            }
            else{
            rs.next();
            JOptionPane.showMessageDialog(Authors.this, "Start of File");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(Authors.this, ex.getMessage());
            Logger.getLogger(Authors.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        try {
            if(rs.first())
            {
            String authorID = String.valueOf(rs.getInt(1));
            String first = rs.getString(2);
            String last = rs.getString(3);
            String book = rs.getString(4);
            
            txtID.setText(authorID);
            txtFirstName.setText(first);
            txtLastName.setText(last);
            txtBookTitle.setText(book);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(Authors.this, ex.getMessage());
            Logger.getLogger(Authors.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
try {
            if(rs.last())
            {
            String authorID = String.valueOf(rs.getInt(1));
            String first = rs.getString(2);
            String last = rs.getString(3);
            String book = rs.getString(4);
            
            txtID.setText(authorID);
            txtFirstName.setText(first);
            txtLastName.setText(last);
            txtBookTitle.setText(book);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(Authors.this, ex.getMessage());
            Logger.getLogger(Authors.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnLastActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            int newID = Integer.parseInt(txtID.getText());
            String first = txtFirstName.getText();
            String last = txtLastName.getText();
            String book = txtBookTitle.getText();
            
            rs.updateInt(1, newID);
            rs.updateString(2, first);
            rs.updateString(3, last);
            rs.updateString(4, book);
            rs.updateRow();
            JOptionPane.showMessageDialog(Authors.this, "Record Updated");
        } catch (SQLException ex) {
            Logger.getLogger(Authors.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewActionPerformed
        try {
            curRow = rs.getRow();
        } catch (SQLException ex) {
            Logger.getLogger(Authors.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            txtID.setText("");
            txtFirstName.setText("");
            txtLastName.setText("");
            txtBookTitle.setText("");
            
            btnFirst.setEnabled(false);
            btnNext.setEnabled(false);
            btnPrevious.setEnabled(false);
            btnLast.setEnabled(false);
            btnUpdate.setEnabled(false);
            btnDelete.setEnabled(false);
            btnAddNew.setEnabled(false);
            
            btnSave.setEnabled(true);
            btnCancel.setEnabled(true);
    }//GEN-LAST:event_btnAddNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            String first = txtFirstName.getText();
            String last = txtLastName.getText();
            String book = txtBookTitle.getText();
            int newID = Integer.parseInt(txtID.getText());
            
            rs.moveToInsertRow();
            
            rs.updateInt("ID", newID);
            rs.updateString("FirstName", first);
            rs.updateString("LastName", last);
            rs.updateString(4, book);
            
            rs.insertRow();
            
            statement.close();
            rs.close();
            JOptionPane.showMessageDialog(Authors.this, "New Record Added");
            connectDB();
            /*statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            
            String sql = "SELECT * FROM Authors";
            rs = statement.executeQuery(sql);
            
            rs.next();
            String id = Integer.toString(rs.getInt("ID"));
            String first2 = rs.getString("FirstName");
            String last2 = rs.getString("LastName");
            String book2 = rs.getString(4);
            
            txtID.setText(id);
            txtFirstName.setText(first2);
            txtLastName.setText(last2);
            txtBookTitle.setText(book2);*/
            
            btnFirst.setEnabled(true);
            btnNext.setEnabled(true);
            btnPrevious.setEnabled(true);
            btnLast.setEnabled(true);
            btnUpdate.setEnabled(true);
            btnDelete.setEnabled(true);
            btnAddNew.setEnabled(true);
            
            btnSave.setEnabled(false);
            btnCancel.setEnabled(false);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(Authors.this, ex.getMessage());
            Logger.getLogger(Authors.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        try {
            rs.absolute(curRow);
            
            txtFirstName.setText(rs.getString("FirstName"));
            txtLastName.setText(rs.getString("LastName"));
            txtBookTitle.setText(rs.getString(4));
            txtID.setText(Integer.toString(rs.getInt("ID")));
            
            btnFirst.setEnabled(true);
            btnNext.setEnabled(true);
            btnPrevious.setEnabled(true);
            btnLast.setEnabled(true);
            btnUpdate.setEnabled(true);
            btnDelete.setEnabled(true);
            btnAddNew.setEnabled(true);
            
            btnSave.setEnabled(false);
            btnCancel.setEnabled(false);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(Authors.this, ex.getMessage());
            Logger.getLogger(Authors.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            rs.deleteRow();
            
            statement.close();
            rs.close();
            JOptionPane.showMessageDialog(Authors.this, "Record Deleted");
            
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            
            String sql = "SELECT * FROM Authors";
            rs = statement.executeQuery(sql);
            
            rs.next();
            String id = Integer.toString(rs.getInt("ID"));
            String first2 = rs.getString("FirstName");
            String last2 = rs.getString("LastName");
            String book2 = rs.getString(4);
            
            txtID.setText(id);
            txtFirstName.setText(first2);
            txtLastName.setText(last2);
            txtBookTitle.setText(book2);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(Authors.this, ex.getMessage());
            Logger.getLogger(Authors.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Authors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Authors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Authors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Authors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Authors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNew;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtBookTitle;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLastName;
    // End of variables declaration//GEN-END:variables
}
