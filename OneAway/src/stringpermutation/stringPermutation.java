/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringpermutation;
//Generate all permutations of a given string

/**
 *
 * @author Hanane Nour
 */
public class stringPermutation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "Tea";
        permute (str, 0, str.length()-1);
    }
    
    public static void permute (String str, int l, int r)
    {
        if (l == r)
        {
            System.out.println(str);
        }
        else
        {
            for (int i = l; i<=r; i++)
            {
               str = swap (str, l, i);
               permute (str, l+1, r);
               str = swap(str, l, i);
            }
        }
    }
    
    public static String swap(String str,int i,int j)
    {
        char[] charArray = str.toCharArray();
        char temp;
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        
        return String.valueOf(charArray);
    }
    
}
