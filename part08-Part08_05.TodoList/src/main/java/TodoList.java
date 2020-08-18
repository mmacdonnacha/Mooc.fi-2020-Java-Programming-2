
import java.util.ArrayList;

/**
 *
 * @author micheal
 */
public class TodoList {

    private ArrayList<String> list;

    public TodoList() {
        list = new ArrayList<>();
    }

    public void add(String task) {
        //- add the task passed as a parameter to the todo list.
        this.list.add(task);
    }

    public void print() {
        //- prints the exercises. 
        //Each task has a number associated with it on the print statement 
        //— use the task's index here (+1).
        for(int i=0; i<this.list.size(); i++){
            System.out.println((i+1) + ": " + this.list.get(i));
        }
    }

    public void remove(int number) {
        //- removes the task associated with the given number;
        // the number is the one seen associated with the task in the print.
        this.list.remove(number - 1);
    }

}
