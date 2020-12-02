/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversewords;


/**
 *
 * @author Hanane Nour
 */
public class ReverseWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "This is a sentence";
        System.out.println(reverseWords(str));
    }
    public static String reverseWords (String str)
    {
      String[] array = str.split("\\s");
     
          
      for (int l = 0, r= array.length-1; l<r;l++,r--)
      {
          String temp;
          temp = array[l];
          array[l] = array[r];
          array[r]= temp;
      }
     String output = "";
     for (String word : array) {
            output += word + " ";
        }
     return output;
    }
}
