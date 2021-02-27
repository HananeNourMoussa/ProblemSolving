/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverserecursive;

/**
 *
 * @author Hanane Nour
 */
public class ReverseRecursive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "string";
        System.out.println(reverseRecursive(str));
    }
    
    public static String reverseRecursive (String str)
    {
        if (str.length() < 2)
            return str;
        else
        {
            return (str.substring(1))+str.charAt(0);
        }
    }
}
