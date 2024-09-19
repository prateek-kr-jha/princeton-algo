public class QuickUnionUf implements UF {
    private int[] id;
    private int count;
    public QuickUnionUf(int N) {
        id = new int[N];
        for(int i = 0; i < id.length; i++) {
            id[i] = i;
        }

        count = N;
    }

    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);

        if(rootP == rootQ)  return;

        id[rootP] = rootQ;
        count--;
    }

    // public int find(int q) {
    //     if(id[q] == q) return q;
    //     return find(id[q]);
    // }

    public int find(int q) {

        while(id[q] != q) {
            q = id[q];
        }
        return q;
    }

    public boolean connected(int p, int q) {
        return find(q) == find(p);
    }

    public int count() {
        return count;
    }
}