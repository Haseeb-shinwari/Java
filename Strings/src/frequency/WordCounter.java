/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package frequency;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ali
 */
public class WordCounter {
    public static void main(String[] args) throws IOException
    {
        FileInputStream file = new FileInputStream("text.txt");
        Scanner inputFile = new Scanner(file);
        
        ArrayList<String> words = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();
       // List<String> tokens = getTokens("[a-zA-Z]+");
        int index = 0;
        while(inputFile.hasNext())
        {
            String word = inputFile.next();
            if(words.contains(word)){
                index = words.indexOf(word);
                count.set(index, count.get(index)+1);
            }
            else {
                words.add(word);
                count.add(1);
            }
        }
        inputFile.close();
        file.close();
        
        for (int i = 0; i < words.size(); i++)
            System.err.println(words.get(i)+": " + count.get(i));
    }
    
}
