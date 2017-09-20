/* Java program for Dynamic Programming implementation
   of Min Cost Path problem */
import java.util.*;
 
class MinimumCostPath
{
    /* A utility function that returns minimum of 3 integers */
    private static int min(int x, int y, int z)
    {
        if (x < y)
            return (x < z)? x : z;
        else
            return (y < z)? y : z;
    }
 
    private static int minCost(int cost[][], int m, int n)
    {
        int i, j;
        int tc[][]=new int[m+1][n+1];
        System.out.println("size is "+tc.length+tc[0].length);
 
        tc[0][0] = cost[0][0];
        
 
        /* Initialize first column of total cost(tc) array */
        for (i = 1; i <= m; i++)
            tc[i][0] = tc[i-1][0] + cost[i][0];
 
        /* Initialize first row of tc array */
        for (j = 1; j <= n; j++)
            tc[0][j] = tc[0][j-1] + cost[0][j];
 
        /* Construct rest of the tc array */
        for (i = 1; i <= m; i++)
            for (j = 1; j <= n; j++)
                tc[i][j] = min(tc[i-1][j-1], 
                               tc[i-1][j],
                               tc[i][j-1]) + cost[i][j];
 
        return tc[m][n];
    }
 
    /* Driver program to test above functions */
    public static void main(String args[])
    {
        int cost[][]= {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};
        System.out.println("minimum cost to reach (2,1) = " +
                                         minCost(cost,2,0));
        String s="ABC";
        char arr[] =s.toCharArray();
        
        for(char a:arr)
        {
        	System.out.println(Character.getNumericValue(a));
        }
        System.out.println('z'/'a');
    }
    
    
}
// This code is contributed by Pankaj Kumar