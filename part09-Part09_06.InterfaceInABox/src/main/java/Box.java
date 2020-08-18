import java.util.ArrayList;

/**
 *
 * @author micheal
 */
public class Box implements Packable{
    private ArrayList<Packable> box;
    private double maxCapacity;
    
    public Box(double weight){
        this.box = new ArrayList<>();
        this.maxCapacity = weight;              
    }
    
    
    public void add(Packable item){
        if(weight() + item.weight() <= this.maxCapacity){
            this.box.add(item);
        }
    }
    
    @Override
    public double weight(){
        double currentWeight = 0.0;
        for(Packable p : this.box){
            currentWeight += p.weight();
        }
        
        return currentWeight;
    }
    
    @Override
    public String toString(){
        
        
        return "Box: " + this.box.size() + " items, total weight " + weight() + " kg";
    }
    
}
