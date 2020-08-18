
/**
 *
 * @author micheal
 */
public class Container {
    private int capacity;
    private final int FULLCAPACITY = 100;
    
    public Container(){
        this.capacity = 0;
    }
    
    public int contains(){
        return this.capacity;
    }
    
    public void add(int amount){
        if(amount > 0){
            int newAmount = this.capacity + amount;
            if(newAmount > FULLCAPACITY){
                this.capacity = FULLCAPACITY;
            }else{
                this.capacity = newAmount;
            }
            
        }
    }
    
    
    public void remove(int amount){
        if(amount > 0){
            int newAmount = this.capacity - amount;
            if(amount > this.capacity){
                this.capacity = 0;
            }else{
                this.capacity = newAmount;
            } 
        }
    }
    
    public int move(int amount){
        int moveAmount = 0;
        
        if(amount > 0){    
            if(amount > this.capacity){
                moveAmount = this.capacity;
            }else{
                moveAmount = amount;
            }            
        }
        
        remove(amount);
        return moveAmount;
    }

    
    
    @Override
    public String toString(){
        return this.capacity + "/" + this.FULLCAPACITY;
    }
}
