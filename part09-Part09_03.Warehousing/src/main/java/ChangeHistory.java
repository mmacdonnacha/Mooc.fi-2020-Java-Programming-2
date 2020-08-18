
import java.util.ArrayList;

/**
 *
 * @author micheal
 */
public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        // creates an empty ChangeHistory object.
        history = new ArrayList<>();
    }

    public void add(double status) {
        // adds provided status as the latest amount to remember in the change history.
        this.history.add(status);
    }

    public void clear() {
        // empties the history.
        this.history.clear();
    }

    @Override
    public String toString() {
        // returns the string representation of the change history. 
        // The string representation provided by the ArrayList class is sufficient.
        return this.history.toString();
    }

    public double maxValue() {
        // returns the largest value in the change history. 
        // If the history is empty, the method should return zero.
        double max;
        if (this.history.isEmpty()) {
            max = 0.0;
        } else {
            max = this.history.get(0);
            for (double d : this.history) {
                if (max < d) {
                    max = d;
                }
            }
        }

        return max;
    }

    public double minValue() {
        // returns the smallest value in the change history. 
        // If the history is empty, the method should return zero.
        double min;
        if (this.history.isEmpty()) {
            min = 0.0;
        } else {
            min = this.history.get(0);
            for (double d : this.history) {
                if (min > d) {
                    min = d;
                }
            }
        }

        return min;
    }

    public double average() {
        // returns the average of the values in the change history. 
        // If the history is empty, the method should return zero.
        double sum = 0.0;
        if (this.history.isEmpty()) {
            sum = 0.0;
        } else {
            for (double d : this.history) {
                sum += d;
            }
        }

        double average = sum / this.history.size();

        return average;
    }

}
