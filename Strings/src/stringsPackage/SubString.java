/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stringsPackage;

/**
 *
 * @author Ali
 */
// String class substring methods.

public class SubString 
{
   public static void main( String[] args )
   {
      String letters = "abcdefghijklmabcdefghijklm";

      // test substring methods
      System.out.printf( "Substring from index 20 to end is \"%s\"\n",
         letters.substring( 20 ) );
      System.out.printf( "%s \"%s\"\n", 
         "Substring from index 3 up to, but not including 6 is",
         letters.substring( 3, 6 ) );
   } // end main
} // end class SubString
