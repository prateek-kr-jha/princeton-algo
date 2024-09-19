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

    }

    public int find(int q) {
        return 1;
    }

    public boolean connected(int p, int q) {
        return false;
    }

    public int count() {
        return count;
    }
}