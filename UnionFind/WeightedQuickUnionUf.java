public class WeightedQuickUnionUf implements UF {
    public int[] id;
    private int count;
    private int[] sz;
    public WeightedQuickUnionUf(int N) {
        id = new int[N];
        for(int i = 0; i < id.length; i++) {
            id[i] = i;
        }
        count = N;
        sz = new int[N];
        for(int i = 0; i < sz.length; i++) sz[i] = 1;
    }

    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);

        if(rootP == rootQ) return;

        if(sz[rootP] > sz[rootQ]) {
            id[rootQ] = rootP;
            sz[rootP] += sz[rootQ];
        } else {
            id[rootP] = rootQ;
            sz[rootQ] += sz[rootP];
        }
        count--;
    }

    public int find(int q) {
        while(id[q] != q) {
            q = id[q];
        }
        return q;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int count() {
        return count;
    }
}