package assignment._1.Percolation;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

/**
 * Created by irving.lopez on 27/09/16.
 *
 */
public class PercolationStats {

    private double [] thresholds;
    private double mean = -1;
    private double standDev = -1;

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
        return getOpenSitesAverage(percolation, n);
    }

    /**
     * Return number of elements open or full
     * @return
     */
    private int getOpenSites(Percolation percolation, int n) {
        int openSites = 0;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (percolation.isOpen(row, col)) {
                    openSites++;
                }
            }
        }
        return openSites;
    }
    private double getOpenSitesAverage(Percolation percolation, int n) {
        return getOpenSites(percolation, n) / (float) (n * n);
    }

    public double mean() {
        if (mean == -1) {
            mean = StdStats.mean(thresholds);
        }
        return mean;
    }

    public double stddev() {
        if (standDev == -1) {
            standDev = StdStats.stddev(thresholds);
        }
        return standDev;
    }

    public double confidenceLo() {
        return mean() - 1.96 * stddev() / Math.sqrt(thresholds.length);
    }

    public double confidenceHi() {
        return mean() + 1.96 * stddev() / Math.sqrt(thresholds.length);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int tests = Integer.parseInt(args[1]);
        PercolationStats stats = new PercolationStats(n, tests);
        System.out.println("mean \t\t\t = " + stats.mean());
        System.out.println("stdev \t\t\t = " + stats.stddev());
        System.out.println("95% confidence interval = " + stats.confidenceLo() + ", " + stats.confidenceHi());
    }
}
