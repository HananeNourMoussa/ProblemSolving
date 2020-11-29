/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkpermutation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Hanane Nour
 */

//program to check if two strings are permutations of eachother
public class CheckPermutation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        String string1 = sc.next();
        String string2 = sc.next();
        System.out.println(checkPermutationUsingSort(string1, string2));
        System.out.println(checkPermutationUsingHashMap(string1, string2));
        
    }
    
    public static boolean checkPermutationUsingSort (String string1, String string2)
    {
        if (string1.length() != string2.length())
        {
            return false;
        }
        char[] charArray1 = string1.toCharArray();
        char[] charArray2 = string2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        if (Arrays.equals(charArray1, charArray2))
            return true;
        return false;
    }
    
    public static boolean checkPermutationUsingHashMap (String string1, String string2)
    {
        if (string1.length() != string2.length())
        {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap <>();
        for (char c: string1.toCharArray()) 
        {
            if (!map.containsKey(c))
            {
                map.put(c,1);
            }
            else
            {
                int count = map.get(c);
                map.put(c,++count);
            }
        }
        
        for (char c: string2.toCharArray())
        {
            if(!map.containsKey(c))
            {
                return false;
            }
            else
            {
                int count = map.get(c);
                map.put(c, --count);
            }
        }
        
        for (int i : map.values())
        {
            if (i != 0)
                return false;
        }
        return true;
    }
    
}
