/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tokenizer;

/**
 *
 * @author Ali
 */
// StringTokenizer object used to tokenize strings
import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenize
{
   // execute application
   public static void main( String[] args )
   {
      // get sentence
      Scanner scanner = new Scanner( System.in );
      System.out.println( "Enter a sentence and press Enter" );
      String sentence = scanner.nextLine();

      // process user sentence
      String[] tokens = sentence.split( " " );
      System.out.printf( "Number of elements: %d\nThe tokens are:\n",
         tokens.length );

      for ( String token : tokens )
         System.out.println( token );
   } // end main
} // end class Tokenize
