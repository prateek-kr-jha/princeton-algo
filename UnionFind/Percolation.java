import edu.princeton.cs.algs4.WeightedQuickUnionUF;
import edu.princeton.cs.algs4.StdIn;

public class Percolation {
    private int[][] grid;
    private int openSites;
    private int count;
    private int dimension;
    private WeightedQuickUnionUF uf;
    public Percolation(int n) {
        if(n <= 0) {
            throw new IllegalArgumentException("Grid size should be greater than zero.");
        }
        openSites = 0;
        count = (n * n) + 2;
        dimension = n;
        grid = new int[n][n];
        uf = new WeightedQuickUnionUF(count);

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                grid[i][j] = 0;
            }
        }

        // for(int i = 1; i <= n; i++) {
        //     uf.union(count - 1, (n * (n - 1) + i));
        // }

    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        int newRow = row - 1;
        int newCol = col - 1;
        if(newRow < 0 || newCol < 0 || newRow >= dimension || newCol >= dimension) {
            throw new IllegalArgumentException("Grid size should be greater than zero.");
        }
        if(grid[newRow][newCol] == 1) {
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

        if(newRow == 0) {
            uf.union(0, currentUfIdx);
        }

        if(newRow == dimension - 1) {
            uf.union(count - 1, currentUfIdx);
        }
        openSites++;
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        if(row < 1 || col < 1 || row > dimension || col > dimension) {
            throw new IllegalArgumentException("Grid size should be greater than zero.");
        }
        return grid[row - 1][col - 1] == 1;
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        return uf.find(0) == uf.find((dimension * (row - 1) + col));
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        return openSites;
    }

    // does the system percolate?
    public boolean percolates() {
        return uf.find(0) == uf.find(count - 1);
    }

    // test client (optional)
    public static void main(String[] args) {
        int gridSize = StdIn.readInt();
        Percolation grid1 = new Percolation(gridSize);
        
        while(!StdIn.isEmpty()) {
            int x = StdIn.readInt();
            int y = StdIn.readInt();

            grid1.open(x, y);
        }

        System.out.println(grid1.percolates());
        System.out.println(grid1.numberOfOpenSites());
        System.out.println(grid1.isFull(3, 1));
        System.out.println(grid1.isOpen(1, 1));
        System.out.println(grid1.grid[0][0]);
        for(int i = 0; i <grid1.grid.length; i++) {
            for(int j = 0; j < grid1.grid[i].length; j++) {
                System.out.print(grid1.grid[i][j] + " ");

            }
            System.out.println();

        }

    }
}
// TODO: score 100 on assessment