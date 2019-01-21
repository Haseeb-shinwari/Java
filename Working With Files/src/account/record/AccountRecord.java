/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package account.record;

/**
 *
 * @author Ali
 */
public class AccountRecord {
    private int account;
    private String firstName;
    private String lastName;
    private double balance;
    
    public AccountRecord(){
        this(0, "", "", 0.0);
    }
    
    public AccountRecord(int account, String firstName, String lastName, double bal){
        setAccount(account);
        setFirstName(firstName);
        setLastName(lastName);
        setBalance(bal);
    }
    
    public void setAccount(int account)
    {
        this.account = account;
    }
    
    public int getAccount(){
        return account;
    }
    
    public void setFirstName(String name)
    {
        this.firstName = name;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setLastName(String name)
    {
        this.lastName = name;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setBalance(double bal)
    {
        this.balance = bal;
    }
    
    public double getBalance(){
        return balance;
    }
}
