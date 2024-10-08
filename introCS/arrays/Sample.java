public class Sample {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        int[] perm = new int[n];

        for(int i = 0; i < n; i++) {
            perm[i] = i;
        }

        for(int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n -i));
            int temp = perm[r];
            perm[r] = perm[i];
            perm[i] = temp; 
        }

        for(int i = 0; i < m; i++) {
            System.out.print(perm[i] + " ");
        }
        System.out.println();
    }
}
