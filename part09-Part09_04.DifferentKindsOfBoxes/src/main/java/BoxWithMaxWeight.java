import java.util.ArrayList;
/**
 *
 * @author micheal
 */
public class BoxWithMaxWeight extends Box{
    private int maxCapacity;
    private ArrayList<Item> box;
    
    public BoxWithMaxWeight(int capacity){
        this.maxCapacity = capacity;
        this.box = new ArrayList<>();
    }
    
    @Override
    public void add(Item item){
        int totalWeight = 0;
        for(Item thing : this.box){
            totalWeight += thing.getWeight();
        }
        
        if(totalWeight + item.getWeight() <= this.maxCapacity){
            this.box.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item){
        return this.box.contains(item);
    }
}
