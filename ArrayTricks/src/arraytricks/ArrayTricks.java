/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytricks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Hanane Nour
 */
public class ArrayTricks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] array = new int[]{0,3,3,6,7,7,11,15,15};
        //System.out.println(binarySearch(array, 5));
        //Object[] obj = removeDuplicates(array);
        //for (int i = 0; i<obj.length; i++)
        //{
          //  System.out.println(obj[i].toString() + " ");
        //}
        findPairs(array,6);
    }
    
    public static int binarySearch (int[] array, int n)
    {
        int left = 0; 
        int right = array.length-1;
        int middle = (left+right)/2;
        while (left<=right)
        {
            if (array[middle] == n)
            {
                return middle; 
            }
            else if (n < array[middle])
            {
                right = middle-1;
                middle = (left+right)/2;
            }
            else if (n > array[middle])
            {
                left = middle+1;
                middle = (left+right)/2;
            }
            
        }
        return -1;
    }
    
    public static Object[] removeDuplicates (int[] array)
    {
        ArrayList<Integer> list = new ArrayList <>();
        for (int element: array)
        {
            list.add(element);
        }
        HashMap<Integer, Integer> map = new HashMap <>();
        for (int i = 0; i<list.size(); i++)
        {
            if (map.containsKey(list.get(i)))
            {
                list.remove(list.get(i));
            }
            else
            {
                map.put(list.get(i), 1);
            }
        }
        return list.toArray();
    }
    
    public static void findPairs (int[] array, int n)
    {
        if (array.length < 2)
        {
            System.out.println ("No pairs");
            
        }
        HashSet <Integer> set = new HashSet <>();
        for (int element: array)
        {
            int target = n-element;
            if (set.contains(target))
            {
                System.out.println ("("+element+","+target+")");
            }
            else {
                set.add(element);
                 }
        }
    }
    
}
