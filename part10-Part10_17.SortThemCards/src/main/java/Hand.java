
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author micheal
 */
public class Hand implements Comparable<Hand> {

    private List<Card> myHand;

    public Hand() {
        this.myHand = new ArrayList<>();
    }

    public List<Card> getHand() {
        return this.myHand;
    }

    public void add(Card card) {
        this.myHand.add(card);
    }

    public void print() {
        Iterator<Card> iterator = this.myHand.iterator();

        while (iterator.hasNext()) {
            Card card = iterator.next();
            System.out.println(card);
        }
    }

    public void sort() {
        Collections.sort(this.myHand);
    }

    @Override
    public int compareTo(Hand hand) {
        int thisTotal = this.myHand.stream().mapToInt(card -> card.getValue()).sum();
        int otherTotal = hand.getHand().stream().mapToInt(card -> card.getValue()).sum();

        if (thisTotal > otherTotal) {
            return 1;
        } else if (thisTotal < otherTotal) {
            return -1;
        } else {
            return 0;
        }
    }

    public void sortBySuit() {
        BySuitInValueOrder suitInValueOrder = new BySuitInValueOrder();
        Collections.sort(this.myHand, suitInValueOrder);
    }

}
