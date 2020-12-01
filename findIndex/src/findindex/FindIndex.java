/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findindex;

/**
 *
 * @author Hanane Nour
 */
public class FindIndex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "a302b6c2z1";
        System.out.println(findIndex(str, 'z'));
        
    }
    
    public static int findIndex (String str, char ch)
    {
        int sum = 0;
        int i = 0;
        String num = "";
        while (i<str.length())
        {
            if (str.charAt(i) == ch)
            {
                return sum;
            }
            else if (Character.isDigit (str.charAt(i)))
            {
                
                num +=str.charAt(i);
                i++;
                while (Character.isDigit(str.charAt(i)))
                    
                {
                    num+=str.charAt(i);
                    i++;
                }
                
                sum += Integer.parseInt(num); 
                num = "";
            }
            else
            {
                i++;
            }
            
        }
        return -1;
        
    }
    
}
