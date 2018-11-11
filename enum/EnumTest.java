/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.util.EnumSet;
/**
 *
 * @author haseeb
 */
public class EnumTest {
 

      public static void main(String[] args)
       {
    
             System.out.println("All books:");

        // print all books in enum Book
      // Book book creating instance of book class and Bookk.values will go throuhg only consant values 
    
          for ( Book book: Book.values()){
           
             System.out.printf("%-10s%-45s%s%n", book,book.getTitle(),book.getCopyrightYear() );

              System.out.printf("%nDisplay a range of enum constants:%n");
          }
                  // print first four books
               for (Book book : EnumSet.range(Book.JHTP, Book.CPPHTP )){
               
                   System.out.printf("%-10s%-45s%s%n", book,book.getTitle(),book.getCopyrightYear() ) ;
      
               
               }
               
               
 } // end class EnumTest
    
}
