/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromepermutation;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Hanane Nour
 */
public class PalindromePermutation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.println(checkPalindromePermutation_HashMap(string));
    }
    
    public static boolean checkPalindromePermutation_HashMap (String string)
    {
        String str = string.toLowerCase();
        char[] charArray = str.toCharArray();
        HashMap<Character, Integer> map= new HashMap <>(); 
        for (int i = 0; i<charArray.length; i++)
        {
            if (charArray[i] == ' ')
            {
                continue;
            }
            
            else if (!(map.containsKey(charArray[i])))
            {
                map.put(charArray[i], 1);
            }
            else
            {
                int count = map.get(charArray[i]);
                map.put(charArray[i],++count);
            }
        }
        
        int countodd = 0;
        for (int v : map.values())
        {
            if (v%2 == 1)
            {
                countodd++;
            }
        }
        if (countodd == 1 || countodd == 0)
            return true;
        return false;
    }
    
    
    
}
