import java.util.ArrayList;
/**
 *
 * @author miche
 */
public class MisplacingBox extends Box {
    private ArrayList<Item> lostItems;
    
    public MisplacingBox(){
        this.lostItems = new ArrayList<>();
    }
    
    @Override
    public void add(Item item){
        this.lostItems.add(item);
    }
    
    
    @Override 
    public boolean isInBox(Item item){
        return false;
    }
}
