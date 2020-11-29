/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcompression;

/**
 *
 * @author Hanane Nour
 */
public class StringCompression {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(stringCompression("aabcccccaaa"));
    }
    // we use stringbuilder because it offers an efficient runtime
    public static String stringCompression (String string)
    {
        int countconsecutive = 0;
        StringBuilder str = new StringBuilder();
       for (int i = 0; i<string.length(); i++)
       {
           countconsecutive++;
           if (i+1 == string.length()|| string.charAt(i) != string.charAt(i+1))
           {
               str.append(string.charAt(i));
               str.append(countconsecutive);
               countconsecutive = 0;
           }
       }
       return str.length() < string.length() ? str.toString(): string;
    
    }
}
