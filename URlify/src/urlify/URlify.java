/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urlify;

import java.util.Scanner;

/**
 *
 * @author Hanane Nour
 */
public class URlify {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        char[] charArray = new char []{'M', 'r', ' ', 'J', ' ', 'S', ' ', ' ', ' ', ' '};
        
        System.out.println(URlify(charArray, 6));
        
    }
    
    public static String URlify (char[] charArray, int length)
    {
        
        int spacecount = 0;
        //count the spaces
        for (int i = 0; i<length; i++ )
        {
            if (charArray[i] == ' ')
            {
               spacecount++;
            }
        }
        int index = length + 2*spacecount;
        if (length < charArray.length) charArray[length] = '\0';
        for (int i = length-1; i>= 0; i--)
        {
            if (charArray[i] == ' ')
            {
                charArray[index-1] = '0';
                charArray[index-2] = '2';
                charArray[index-3] = '%';
                index = index-3;
                
            }
            else
            {
                charArray[index-1] = charArray[i];
                index--;
            }
            
        }
        return String.valueOf(charArray);
        
    }
    
}
