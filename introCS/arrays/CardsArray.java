public class CardsArray {
    public static void main(String[] args) {
        String[] SUITS = {"Clubs", "Spade", "Diamonds", "Heart"};
        String[] RANKS = {"2", "3","4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        String[] deck = new String[SUITS.length * RANKS.length];

        for(int i = 0; i < RANKS.length; i++) {
            for(int j = 0; j < SUITS.length; j++) {
                deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j] + ".";
            }
        }

        for(int i = 0; i < RANKS.length ; i++) {
            for(int j = 0; j < SUITS.length; j++) {
                System.out.print(deck[SUITS.length * i + j] + " ");
            }
            System.out.println();
        }
    }
}
