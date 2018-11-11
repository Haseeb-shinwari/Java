
package HomeWork;


public class ModifiedAccountClass {
    
     private int balance;
     ModifiedAccountClass(int balance){
         
         this.balance=balance;
         
        }
    public void withDraw(int balance){
    
        if(balance>0  && balance <=this.balance){
        
            int remaining =this.balance -balance;
          
            this.balance=remaining;
            
            System.out.printf(" You draw money : %s %n",balance);
            
            System.out.printf(" Your new balance is: %s %n ",this.balance);
             
              }else{
            
            System.out.println(" with Draw amount exceed account balance");
        }
    }
    
}
