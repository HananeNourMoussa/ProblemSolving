/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstnonrepeated;

import java.util.HashMap;

/**
 *
 * @author Hanane Nour
 */
public class FirstNonRepeated {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String str = "tthiss test";
        System.out.println(returnFirst(str));
        
    }
    
    public static char returnFirst (String str)
    {
        HashMap<Character, Integer> map = new HashMap <>();
        for (int i = 0; i<str.length(); i++)
        {
            if (!map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i), 1);
            }
            else
            {
                int n = map.get(str.charAt(i));
                n++;
                map.put(str.charAt(i), n);
            }
        }
        
        for (int i = 0; i<str.length(); i++)
        {
            if (map.get(str.charAt(i)) == 1)
                return str.charAt(i);
        }
        
        return '~';
    }
    
}
