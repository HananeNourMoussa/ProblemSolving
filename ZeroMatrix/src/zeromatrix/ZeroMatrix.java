/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zeromatrix;

/**
 *
 * @author Hanane Nour
 */
public class ZeroMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matrix = new int[][] {{1,1,1,0}, {0,1,0,1}, {1,1,1,1}};
        for (int i = 0; i<matrix.length; i++)
        {
            for(int j = 0; j<matrix[0].length; j++)
                System.out.print(matrix[i][j]);
            System.out.println("");
        }
        
        System.out.println("");
        setZeros(matrix);
        
        for (int i = 0; i<matrix.length; i++)
        {
            for(int j = 0; j<matrix[0].length; j++)
                System.out.print(matrix[i][j]);
            System.out.println("");
        }
    }
    
    public static void setZeros(int[][] matrix)
    {
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean [matrix[0].length];
        //know where your zeros are
        for (int i = 0; i<matrix.length; i++)
        {
            for (int j = 0; j<matrix[0].length; j++)
            {
                if (matrix[i][j] == 0){
                    row[i] = true;
                    column[j] = true;
                }
            }
        }
        //nullify the rows
        for (int i = 0; i<matrix.length; i++)
        {
          if (row[i] == true)
          {
             nullifyrow(matrix, i );
          }
        }
        for (int j = 0; j< matrix[0].length; j++)
        {
            if (column[j] == true)
            {
                nullifycolumn (matrix, j);
            }
        }
    }
    
    public static void nullifyrow(int[][] matrix, int i)
    {
        for (int k = 0; k<matrix[i].length; k++)
        {
            matrix[i][k] = 0;
        }
    }
    
    public static void nullifycolumn (int[][] matrix, int j)
    {
        for (int k = 0; k<matrix.length; k++)
        {
            matrix[k][j] = 0;
        }
    }
    
}
