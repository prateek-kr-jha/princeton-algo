public class Shuffling {
    public static void main(String[] args) {
        String[] SUITS = {"Spade", "Diamond", "Heart", "Club"};
        String[] RANKS = {"2",  "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        String[] deck = new String[SUITS.length * RANKS.length];

        for(int i = 0; i < RANKS.length; i++) {
            for(int j = 0; j < SUITS.length; j++) {
                deck[RANKS.length * j + i] = RANKS[i] + " of " + SUITS[j];
            }
        }


        for(int i = 0; i < RANKS.length; i++) {
            for(int j = 0; j < SUITS.length; j++) {
                System.out.print(deck[RANKS.length * j + i] + ". ");
            }
            System.out.println();
        }
        int n = deck.length;
        for(int i = 0; i < n; i++) {
            int r = i + (int)(Math.random() * (n - i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
        System.out.println("--------------------------------------------------");

        for(int i = 0; i < RANKS.length; i++) {
            for(int j = 0; j < SUITS.length; j++) {
                System.out.print(deck[RANKS.length * j + i] + ". ");
            }
            System.out.println();
        }
    }
}
