public class SelfAvoidingWalk {
    public static void main(String[] args) {
        int grid_size = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int dead_end = 0;
        for(int i = 0; i < trials; i++) {
            boolean[][] grid = new boolean[grid_size][grid_size];
            int x = grid_size/2;
            int y = grid_size/2;

            while(x > 0 && x < grid_size - 1 && y > 0 && y < grid_size - 1) {

                if(grid[x - 1][y] && grid[x + 1][y] && grid[x][y - 1] && grid[x][y + 1]) {
                    dead_end++;
                    break;
                }
                grid[x][y] = true;
                double p = Math.random();

                if(p < 0.25) {
                    if(!grid[x - 1][y]) {
                        x--;
                    }
                } else if(p < 0.5) {
                    if(!grid[x + 1][y]){
                        x++;
                    }
                } else if(p < 0.75) {
                    if(!grid[x][y - 1]) {
                        y--;
                    }
                } else if(p < 1.0) {
                    if(!grid[x][y + 1]){
                        y++;
                    }
                }
            }
        }

        System.out.println(100 * dead_end/trials + " % dead ends in total trial");
    }
}
