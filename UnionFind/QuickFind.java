import edu.princeton.cs.algs4.StdIn;

public class QuickFind implements UF {
    private int[] id;
    private int count;
    public QuickFind(int N) {
        id = new int[N];
        for(int i = 0; i < id.length; i++) {
            id[i] = i;
        }

        count = N;
    }

    public void union(int p, int q) {
        int pId = id[p];
        int qId = id[q];
        if(pId == qId) return;
        for(int i = 0; i < id.length; i++) {
            if(id[i] == qId) id[i] = pId;
        }
        count--;
    }

    public int find(int q) {
        return id[q];
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int count() {
        return count;
    }
}