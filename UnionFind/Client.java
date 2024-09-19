import edu.princeton.cs.algs4.StdIn;

public class Client {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        QuickUnionUf uf = new QuickUnionUf(N);

        while(!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();

            if(uf.connected(p, q)) continue;
            uf.union(p, q);
            System.out.println(p + " " + q);
        }

        System.out.println(uf.count() + " components");
    }
}
