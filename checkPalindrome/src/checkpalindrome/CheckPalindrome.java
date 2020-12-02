/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkpalindrome;

/**
 *
 * @author Hanane Nour
 */
public class CheckPalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "tat";
        String s2 = "not palindrome";
        System.out.println(checkPalindrome(s1));
        System.out.println(checkPalindrome(s2));

    }
    public static boolean checkPalindrome(String str)
    {
        char[] charArray = str.toCharArray();
        int l = 0; 
        int r = str.length()-1;
        while (l<r)
        {
            if (charArray[l] != charArray[r])
                return false;
            else
            {
                l++; 
                r--;
            }
             
        }
        return true;
    }
    
}
