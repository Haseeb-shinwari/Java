/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package regexpressions;

import java.util.Scanner;

/**
 *
 * @author Ali
 */
// Validate user information using regular expressions.

public class Validation
{
   // validate first name
   public static boolean validateFirstName( String firstName )
   {
      return firstName.matches( "[A-Z][a-zA-Z]*" );
   } // end method validateFirstName

   // validate last name
   public static boolean validateLastName( String lastName )
   {
      return lastName.matches( "[a-zA-z]+([ '-][a-zA-Z]+)*" );
   } // end method validateLastName

   // validate address
   public static boolean validateAddress( String address )
   {
      return address.matches( 
         "\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" );
   } // end method validateAddress

   // validate city
   public static boolean validateCity( String city )
   {
      return city.matches( "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" );
   } // end method validateCity

   // validate state
   public static boolean validateState( String state )
   {
      return state.matches( "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" ) ;
   } // end method validateState

   // validate zip
   public static boolean validateZip( String zip )
   {
      return zip.matches( "\\d{5}" );
   } // end method validateZip

   // validate phone
   public static boolean validatePhone( String phone )
   {
      return phone.matches( "[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}" );
   } // end method validatePhone
   
   public static void main( String[] args )
   {
      // get user input
      Scanner scanner = new Scanner( System.in );
      System.out.println( "Please enter first name:" );
      String firstName = scanner.nextLine();
      System.out.println( "Please enter last name:" );
      String lastName = scanner.nextLine();
      System.out.println( "Please enter address:" );
      String address = scanner.nextLine();
      System.out.println( "Please enter city:" );
      String city = scanner.nextLine();
      System.out.println( "Please enter state:" );
      String state = scanner.nextLine();
      System.out.println( "Please enter zip:" );
      String zip = scanner.nextLine();
      System.out.println( "Please enter phone:" );
      String phone = scanner.nextLine();

      // validate user input and display error message
      System.out.println( "\nValidate Result:" );

      if ( !Validation.validateFirstName( firstName ) )
         System.out.println( "Invalid first name" );
      else if ( !Validation.validateLastName( lastName ) )
         System.out.println( "Invalid last name" );
      else if ( !Validation.validateAddress( address ) )
         System.out.println( "Invalid address" );
      else if ( !Validation.validateCity( city ) )
         System.out.println( "Invalid city" );
      else if ( !Validation.validateState( state ) )
         System.out.println( "Invalid state" );
      else if ( !Validation.validateZip( zip ) )
         System.out.println( "Invalid zip code" );
      else if ( !Validation.validatePhone( phone ) )
         System.out.println( "Invalid phone number" );
      else
         System.out.println( "Valid input.  Thank you." );
   } // end main
} // end class Validation