import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.StdOut;

public class PercolationStats {
    // perform independent trials on an n-by-n grid
    private double[] trialOutput;
    public PercolationStats(int n, int trials) {
        if (n <= 0 || trials <= 0) {
            throw new IllegalArgumentException("Given n <= 0 || trials <= 0");
        }
        trialOutput = new double[trials];

        for(int i = 0; i < trialOutput.length; i++) {
            int openSites = 0;
            Percolation grid1 = new Percolation(n);
            while(!grid1.percolates()) {
                int p = StdRandom.uniformInt(1, n + 1);
                int q = StdRandom.uniformInt(1, n + 1);
                grid1.open(p, q);
            }

            trialOutput[i] = (double) grid1.numberOfOpenSites() / (n * n); 

        }
        

    }

    // sample mean of percolation threshold
    public double mean() {
        return StdStats.mean(trialOutput);
    }

    // sample standard deviation of percolation threshold
    public double stddev() {
        return StdStats.stddev(trialOutput);
    }

    // low endpoint of 95% confidence interval
    public double confidenceLo() {
        double mean = mean();
        double stdDev = stddev();
        
        return mean - ((1.96 * stdDev)/Math.sqrt(trialOutput.length));
    }

    // high endpoint of 95% confidence interval
    public double confidenceHi() {
        double mean = mean();
        double stdDev = stddev();
        return mean + ((1.96 * stdDev)/Math.sqrt(trialOutput.length));
    }

   // test client (see below)
   public static void main(String[] args) {
        int gridSize = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        PercolationStats stats = new PercolationStats(gridSize, trials);

        String confidence = "[" + stats.confidenceLo() + ", " + stats.confidenceHi() + "]";
        StdOut.println("mean                    = " + stats.mean());
        StdOut.println("stddev                  = " + stats.stddev());
        StdOut.println("95% confidence interval = " + confidence);

    }
}