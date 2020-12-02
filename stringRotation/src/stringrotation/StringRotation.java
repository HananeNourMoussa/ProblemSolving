/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringrotation;

// check if a string is a rotation of another
/**
 *
 * @author Hanane Nour
 */
public class StringRotation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String s1 = "ottlewaterb";
        String s2 = "waterbottle";
        System.out.println(isRotation(s1, s2));
    }
    
    public static boolean isRotation (String s1, String s2)
    {
        s1 = s1+s1;
        return s1.contains(s2);
    }
    
}
