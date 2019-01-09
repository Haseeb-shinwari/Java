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
public class StringBuilderCapLen 
{
   public static void main( String[] args )
   {
      StringBuilder buffer = new StringBuilder( "Hello, how are you?" );

      System.out.printf( "buffer = %s\nlength = %d\ncapacity = %d\n\n",
         buffer.toString(), buffer.length(), buffer.capacity() );

      buffer.ensureCapacity( 75 );
      System.out.printf( "New capacity = %d\n\n", buffer.capacity() );

      buffer.setLength( 10 );
      System.out.printf( "New length = %d\nbuffer = %s\n", 
         buffer.length(), buffer.toString() );
      
      buffer.setLength( 15 );
      System.out.printf( "New length = %d\nbuffer = %s\n", 
         buffer.length(), buffer.toString() );
      
   } // end main
} // end class StringBuilderCapLen
