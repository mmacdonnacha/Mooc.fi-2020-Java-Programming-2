
/**
 *
 * @author miche
 */
public class OneItemBox extends Box {
    private int maxCapacity;
    private Item singleItem;
    
    public OneItemBox(){
        this.maxCapacity = 1;
    }
    
    @Override
    public void add(Item item){
        if(this.singleItem == null){
            this.singleItem = item;
        }
    }
    
    
    public boolean isInBox(Item item){
        if(this.singleItem == null){
            return false;
        }
        
        return this.singleItem.equals(item);
    }
    
}
