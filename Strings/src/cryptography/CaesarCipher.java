/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cryptography;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Ali
 */
public class CaesarCipher {
    public String encrypt(String input, int key) {
        //Make a StringBuilder with message (encrypted)
		input = input.toLowerCase();
        StringBuilder encrypted = new StringBuilder(input);
       
        //Write down the alphabet
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        alphabet = alphabet.toLowerCase();
        //Compute the shifted alphabet
        String shiftedAlphabet = alphabet.substring(key)+
        alphabet.substring(0,key);
        //Count from 0 to < length of encrypted, (call it i)
        for(int i = 0; i < encrypted.length(); i++) {
            //Look at the ith character of encrypted (call it currChar)
            char currChar = encrypted.charAt(i);
            //Find the index of currChar in the alphabet (call it idx)
            int index = alphabet.indexOf(currChar);
            //If currChar is in the alphabet
            if(index != -1){
                //Get the indexth character of shiftedAlphabet (newChar)
                char newChar = shiftedAlphabet.charAt(index);
                //Replace the ith character of encrypted with newChar
                encrypted.setCharAt(i, newChar);
            }
            //Otherwise: do nothing
        }
        //Your answer is the String inside of encrypted
        return encrypted.toString();
}

	public static void main(String[] args)
	{
		try{
			int key = 17;
			BufferedReader br = new BufferedReader(new FileReader("message2.txt"));
	        String[] words;
			String line;
	        String message = "";
			while((line = br.readLine())!= null){
				words = line.split("");
				for (String word : words)
				{
					message = message + word;
				}
			 //message = line;
				}
	        br.close();
	        CaesarCipher caesar = new CaesarCipher();
	        String encrypted = caesar.encrypt(message, key);
	        System.out.println(encrypted);
	        String decrypted = caesar.encrypt(encrypted, 26-key);
	        System.out.println(decrypted);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
    }
}
