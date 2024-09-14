import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {

    public static void main(String[] args) {
        int i = 0;
        String word = "";

        while (!StdIn.isEmpty()) {
            String current = StdIn.readString();
            boolean accept = StdRandom.bernoulli(1 / (i + 1.0));
            if (accept) {
                word = current;
            }
            i++;
        }
        StdOut.println(word);
    }
}
