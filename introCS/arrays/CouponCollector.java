public class CouponCollector {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        boolean[] cards = new boolean[n];

        int totalCards = 0;
        int distinctCard = 0;
        while(distinctCard < n) {
            int cardIdx = (int) (Math.random() * n);
            totalCards++;
            if(!cards[cardIdx]) {
                cards[cardIdx] = true;
                distinctCard++;
            }
        }

        System.out.println("total cards collected = " + totalCards);
        System.out.println("Number of distinct cards = " + distinctCard);
    }
}
