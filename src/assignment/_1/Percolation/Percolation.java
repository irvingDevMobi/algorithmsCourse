package assignment._1.Percolation;

import edu.princeton.cs.algs4.WeightedQuickUnionUF;

/**
 * Created by Irving Lop on 12/09/2016.
 *
 */
public class Percolation {

    private boolean [][] grid;
    private WeightedQuickUnionUF wQUUF;

    /**
     * create n-by-n grid, with all sites blocked
     * @param n size of the square grid
     */
    public Percolation(int n) {
        if (n <= 0) {
            throw  new IllegalArgumentException("elements must be greater than zero");
        }
        grid = new boolean[n][n];
        wQUUF = new WeightedQuickUnionUF(n*n+2);
    }

    public void open(int row, int column) {
        validate(row, column);
        int rowIndex = row - 1;
        int colIndex = column - 1;
        int arrayIndex = rowIndex * grid.length + column;
        if (grid[rowIndex][colIndex])
            return;
        grid[rowIndex][colIndex] = true;
        // Top Connection
        if (rowIndex == 0) {
            wQUUF.union(arrayIndex, 0);
        } else if (grid[rowIndex - 1][colIndex]) {
            wQUUF.union(arrayIndex, (rowIndex - 1) * grid.length + column);
        }
        // Left connection
        if (colIndex > 0 && grid[rowIndex][colIndex - 1]) {
            wQUUF.union(arrayIndex, arrayIndex - 1);
        }
        // Right connection
        if (colIndex < grid.length - 1 && grid[rowIndex][colIndex + 1]) {
            wQUUF.union(arrayIndex, arrayIndex + 1);
        }
        // Bottom connection
        if (rowIndex == grid.length - 1) {
            wQUUF.union(arrayIndex, grid.length * grid.length + 1);
        } else if (grid[rowIndex + 1][colIndex]) {
            wQUUF.union(arrayIndex, row * grid.length + column);
        }
    }

    public boolean isOpen(int row, int column) {
        validate(row, column);
        return grid[row - 1][column - 1];
    }

    public boolean isFull(int row, int column) {
        validate(row, column);
        int arrayIndex = (row -1) * grid.length + column;
        return wQUUF.connected(arrayIndex, 0);
    }

    public boolean percolates() {
        return wQUUF.connected(0, grid.length * grid.length + 1);
    }

    private void validate(int ... indexes) {
        for (int index : indexes) {
            if (index <= 0 || index > grid.length) {
                throw new IndexOutOfBoundsException("index must be greater than 0 and less than " + (grid.length + 1)
                        + ". You put " + index);
            }
        }
    }

    private void print() {
        for (int row = 0; row < grid.length; row++) {
            System.out.println();
            for (int col = 0; col < grid.length; col++) {
                if (isFull(row + 1, col + 1)) {
                    System.out.print("-");
                } else if (grid[row][col]) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
        }
        System.out.println();
    }
}
