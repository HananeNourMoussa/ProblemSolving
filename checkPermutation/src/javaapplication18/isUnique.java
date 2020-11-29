/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Hanane Nour
 */

//determine if a string has all unique numbers
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        
        String string = new String();
        Scanner sc  = new Scanner (System.in);
        string = sc.nextLine();
        System.out.println(isUnique(string));
        System.out.println(isUniqueUsingSet(string));
        
        
    }
    
    public static boolean isUnique (String string)
    {
      
      for (int i = 0; i<string.length(); i++)
      {
          char ch = string.charAt(i);
          if (string.lastIndexOf(ch) != i)
              return false;
      }
      
      return true;
    }
    
    public static boolean isUniqueUsingSet (String string)
    {
        char[] charArray = string.toCharArray();
        //because an array cannot be autoboxed in java
        Character[] boxedArray = new Character [charArray.length];
        for (int i = 0; i<charArray.length; i++)
        {
            boxedArray[i] = charArray[i];
        }
        Set <Character> set = new HashSet <>(Arrays.asList(boxedArray));
        if (set.size() < string.length())
            return false;
        return true;
        
    }
   
    
    
    
}
