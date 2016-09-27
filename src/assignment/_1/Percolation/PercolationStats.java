package assignment._1.Percolation;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

/**
 * Created by irving.lopez on 27/09/16.
 *
 */
public class PercolationStats {

    private double [] thresholds;

    public PercolationStats(int n, int trials) {
        if (n <= 0 || trials <= 0) {
            throw new IllegalArgumentException();
        }
        thresholds = new double[trials];
        for (int t = 0; t < trials; t++) {
            thresholds[t] = threshold(n);
        }
    }

    private double threshold(int n) {
        Percolation percolation = new Percolation(n);
        while (!percolation.percolates()) {
            int row = StdRandom.uniform(1, n + 1);
            int col = StdRandom.uniform(1, n + 1);
            percolation.open(row, col);
        }
//        percolation.print();
        return percolation.getOpenSitesAverage();
    }

    public double mean() {
        return StdStats.mean(thresholds);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        new PercolationStats(n, 10);
    }
}
