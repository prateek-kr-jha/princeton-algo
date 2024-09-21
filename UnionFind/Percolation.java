public class Percolation {
    private int[][] grid;
    private int[] id;
    private int count;
    public Percolation(int n) {
        grid = new int[n][n];
        id = new int[n * n];
        count = n * n;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                grid[i][j] = 0;
            }
        }

        for(inti = 0; i < count; i++) {
            id[i] = i;
        }
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {

    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        return grid[row][col] == 0;
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        return true;
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        return 0;
    }

    // does the system percolate?
    public boolean percolates() {
        return true;
    }

    // test client (optional)
    public static void main(String[] args) {

    }
}