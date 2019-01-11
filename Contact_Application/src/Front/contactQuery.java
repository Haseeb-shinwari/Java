
package Front;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class contactQuery {

    public void insertContact(contact cont){
        
         Connection con=myConnection.getConnection();
        PreparedStatement ps;
        try {
            ps=con.prepareStatement(" INSERT INTO `myContact` ( `firstName`,`lastName`,`group`,`phone`,`email`,`address`,`userid`) VALUES(?,?,?,?,?,?,?) ");
           ps.setString(1, cont.getFirstName());
           ps.setString(2, cont.getLastName());
           ps.setString(3, cont.getGroup());
           ps.setString(4, cont.getPhone());
           ps.setString(5, cont.getEmail());
           ps.setString(6,cont.getAddress() );
           ps.setInt(7, cont.getUid());
           
      if(ps.executeUpdate() !=0){
                   JOptionPane.showMessageDialog(null, "New Contact Added");
               }else{
                           JOptionPane.showMessageDialog(null, "Somthing Wrong");
 
                   }       
           
        } catch (SQLException ex) {
            System.out.println("err in query");
            Logger.getLogger(contactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
     public void updateContact(contact cont){
        
         Connection con=myConnection.getConnection();
        PreparedStatement ps ;
        try {
           String updateQuery=" UPDATE `mycontact` SET `firstName`=?,`lastName`=?,`group`=?,`phone`=?,`email`=?,`address`=?  WHERE `id`=?";

           ps=con.prepareStatement(updateQuery);
           ps.setString(1, cont.getFirstName());
           ps.setString(2, cont.getLastName());
           ps.setString(3, cont.getGroup());
           ps.setString(4, cont.getPhone());
           ps.setString(5, cont.getEmail());
           ps.setString(6,cont.getAddress() );
           ps.setInt(7, cont.getCid());
         
           if(ps.executeUpdate() !=0){
                   JOptionPane.showMessageDialog(null, "contact Data Edited ");
               }else{
                           JOptionPane.showMessageDialog(null, "Somthing Wrong");
 
                   }       
           
        } catch (SQLException ex) {
            System.out.println("err in  update query");
            Logger.getLogger(contactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
     
      public void deleteContact(int cid ){
        
         Connection con=myConnection.getConnection();
        PreparedStatement ps;
        try {
            ps=con.prepareStatement("DELETE FROM `mycontact` WHERE `id`=?");
            ps.setInt(1, cid);
           
      if(ps.executeUpdate() !=0){
                   JOptionPane.showMessageDialog(null, "Contact Delete");
               }else{
                           JOptionPane.showMessageDialog(null, "Somthing Wrong");
 
                   }       
           
        } catch (SQLException ex) {
            System.out.println("err in query");
            Logger.getLogger(contactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public ArrayList<contact> contactList(int userId){
       ArrayList<contact>clist= new ArrayList<contact>();
       Connection con=myConnection.getConnection();
       Statement st;
       ResultSet rs;
 
        try {
            st=con.createStatement();
            rs=st.executeQuery("SELECT `id`, `firstName`, `lastName`, `group`, `phone`, `email`, `address`  FROM `mycontact` WHERE userid = "+userId);
            contact ct;
            while(rs.next()){
                
                ct=new contact(rs.getInt("id"), 
                                          rs.getString("firstName"), 
                                          rs.getString("lastName"), 
                                           rs.getString("group"),
                                          rs.getString("phone"),
                                          rs.getString("email"),
                                          rs.getString("address"),
                                                userId);
                clist.add(ct);
                
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(contactQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
       return clist;
    }
    
}
    
