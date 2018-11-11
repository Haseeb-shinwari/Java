
package HomeWork;

import java.util.Scanner;

public class AccountTest {
    

     public static void main(String [] args){

        Scanner input=new Scanner(System.in);
        
         System.out.println(" Enter money to store in account");
         
         int storeMoney=input.nextInt();
         
         
         ModifiedAccountClass obj1=new ModifiedAccountClass(storeMoney);
         
         System.out.println(" Enter Money You want to Draw");
         
         int moneydraw=input.nextInt();
         
         obj1.withDraw(moneydraw);
         
         
    }
    
    
}
