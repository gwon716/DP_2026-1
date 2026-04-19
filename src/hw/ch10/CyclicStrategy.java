package hw.ch10;

public class CyclicStrategy implements Strategy {
    private Hand[] hands = { Hand.ROCK, Hand.SCISSORS, Hand.PAPER };
    private int current = 0;

    @Override
    public Hand nextHand() {
        Hand hand = hands[current];
        current = (current + 1) % hands.length;
        return hand;
    }
    @Override
    public void study(boolean win) {
        
    }
}
