import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck implements DeckInterface {
    ArrayList<String> cards;
    int count = 52;

    public Deck() {
        List <String> ranks = new ArrayList<>();
        List <String> suits = new ArrayList<>();
        cards = new ArrayList<>();

        Collections.addAll(ranks, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King");
        Collections.addAll(suits, "Spades", "Hearts", "Diamonds", "Clubs");
        for (String suit : suits) {
            for (String rank : ranks) {
                String card = String.format("%s of %s ",rank, suit);
                cards.add(card);
            }
        }
        shuffle();
    }

    public void push(String card) {
        this.cards.add(card);
    }

    public Object pop() {
        System.out.printf("There are %d cards left%n", count--);
        return this.cards.remove(cards.size() - 1);
    }

    public boolean isEmpty() {
        if (!this.cards.isEmpty()) {
            return false;
        } else {
            System.out.println("Deck is empty");
            return true;
        }
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }
}
