/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondlargest;

/**
 *
 * @author Hanane Nour
 */
public class SecondLargest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arr = new int[] {3,5,8,2,9,12,1,16};
        int[] arr2 = new int[] {8,6,22,15,4,5,2};
        System.out.println(findSecondMax(arr));
        System.out.println(findSecondMax(arr2));
    }
    public static int findSecondMax (int[] arr)
    {
        int max = Integer.MIN_VALUE;
        int secondMax = 0;
        for (int i = 0; i<arr.length; i++)
        {
            if (arr[i] > max)
            {
                secondMax = max;
                max = arr[i];
            }
            if (arr[i] > secondMax && arr[i] < max)
            {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    
}
