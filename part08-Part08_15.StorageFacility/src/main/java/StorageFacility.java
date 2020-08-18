
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author micheal
 */
public class StorageFacility {

    private HashMap<String, ArrayList<String>> containers;

    public StorageFacility() {
        this.containers = new HashMap<>();
    }

    public void add(String unit, String item) {
        // adds the parameter item to the storage unit that is also given as a parameter.
        if (!this.containers.containsKey(unit)) {
            ArrayList<String> list = new ArrayList<>();
            list.add(item);
            this.containers.put(unit, list);
        } else {
            this.containers.get(unit).add(item);
        }
    }

    public ArrayList<String> contents(String storageUnit) {
        // returns a list that contains all the items in the 
        // storage unit indicated by the parameter. 
        // If there is no such storage unit or it contains no items, 
        //  the method should return an empty list.

        boolean hasUnit = this.containers.containsKey(storageUnit);

        if (!hasUnit || this.containers.get(storageUnit).isEmpty()) {
            return new ArrayList<>();
        } else {
            return this.containers.get(storageUnit);
        }

    }

    public void remove(String storageUnit, String item) {
        // removes the given item from the given storage unit. 
        // NB! Only removes one item — if there are several items with the same name, 
        // the rest still remain.
        // If the storage unit would be empty after the removal, 
        // the method also removes the unit.
        boolean hasUnit = this.containers.containsKey(storageUnit);
        boolean isEmpty = this.containers.get(storageUnit).isEmpty();

        if (hasUnit && !isEmpty) {
            this.containers.get(storageUnit).remove(item);
        } 
        
        if(this.containers.get(storageUnit).isEmpty()){
            this.containers.remove(storageUnit);
        }

    }

    public ArrayList<String> storageUnits(){
        // returns the names of the storage units as a list. 
        // NB! Only the units that contain items are listed.
       
        ArrayList<String> units = new ArrayList<>();
        for(String unit : this.containers.keySet()){
            if(!unit.isEmpty()){
                units.add(unit);
            }
        }
        
        return units;
    }

}
