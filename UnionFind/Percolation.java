import java.lang.IllegalAccessError;
import java.lang.IllegalArgumentException;
import java.util.Scanner;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
    private int[][] grid;
    private int openSites;
    private int count;
    private int dimension;
    public WeightedQuickUnionUf uf;
    public Percolation(int n) {
        if(n <= 0) {
            throw new IllegalArgumentException("Grid size should be greater than zero.");
        }
        openSites = 0;
        count = (n * n) + 2;
        dimension = n;
        grid = new int[n][n];
        uf = new WeightedQuickUnionUf(count);

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                grid[i][j] = 0;
            }
        }

        for(int i = 1; i <= n; i++) {
            uf.union(0, i);
            uf.union(count - 1, (n * (n - 1) + i));
        }

    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        int newRow = row - 1;
        int newCol = col - 1;
        if(grid[newRow][newCol] == 1) {
            System.out.println("Already open!!");
            return;
        }
        grid[newRow][newCol] = 1;
        int currentUfIdx = dimension * newRow + col;
        if((newRow - 1 >= 0) && isOpen(row - 1, col)) {
            uf.union(dimension * (newRow - 1) + col, currentUfIdx);
        }
        if((newRow + 1 < dimension) && isOpen(row + 1, col)) {
            uf.union(dimension * (newRow + 1) + col, currentUfIdx);

        }
        if((newCol - 1 >= 0) && isOpen( row, col - 1)) {
            uf.union((dimension * newRow) + col - 1, currentUfIdx);

        }
        if((newCol + 1 < dimension) && isOpen(row, col + 1)) {
            uf.union((dimension * newRow) + col + 1, currentUfIdx);
            
        }
        openSites++;
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        if(row < 1 || col < 1 || row > dimension || col > dimension) {
            throw new IllegalAccessError();
        }
        return grid[row - 1][col - 1] == 1;
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        return uf.connected(0, (dimension * (row - 1) + col));
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        return openSites;
    }

    // does the system percolate?
    public boolean percolates() {
        return uf.connected(0, count - 1);
    }

    // test client (optional)
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int gridSize = scn.nextInt();
        Percolation grid1 = new Percolation(gridSize);
        
        while(scn.hasNext()) {
            int x = scn.nextInt();
            int y = scn.nextInt();

            grid1.open(x, y);
        }

        System.out.println(grid1.percolates());
        System.out.println(grid1.numberOfOpenSites());

    }
}