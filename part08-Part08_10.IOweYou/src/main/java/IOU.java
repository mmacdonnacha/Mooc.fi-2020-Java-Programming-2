import java.util.HashMap;
/**
 *
 * @author micheal
 */
public class IOU {
    private HashMap<String, Double> map;
    
    public IOU(){
        map = new HashMap<>();
    }
    
    
    public void setSum(String toWhom, double amount){
        // saves the amount owed and the person owed to to the IOU.
        map.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom){
        // returns the amount owed to the person whose name is given as a parameter.
        // If the person cannot be found, it returns 0.
        return this.map.getOrDefault(toWhom, 0.0);
    }

}
