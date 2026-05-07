public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Hand utsav = new Hand();
        // deal 5 cards
        for(int i = 0; i < 5; i++) {
            // get a card from the deck
            Card card = deck.deal();
            // deal that card to the hand
            utsav.deal(card);
        }
        int handValue = utsav.getValue();
        System.out.println("This hand is worth " + handValue);
    }

}
