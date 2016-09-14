package assignment._1.Percolation;

import edu.princeton.cs.algs4.WeightedQuickUnionUF;

/**
 * Created by Irving Lop on 12/09/2016.
 *
 */
public class Percolation {

    private int [][] grid;
    private WeightedQuickUnionUF wQUUF;

    /**
     * create n-by-n grid, with all sites blocked
     * @param n size of the square grid
     */
    public Percolation(int n) {
        grid = new int[n][n];
        int index = 1;
        for (int row = 0; row < n; row++)
        {
            for (int column = 0; column < n; column++)
            {
                grid[row][column] = index;
                index++;
            }
        }
        wQUUF = new WeightedQuickUnionUF(n*n+2);
    }
}
