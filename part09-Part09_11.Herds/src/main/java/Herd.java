import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author micheal
 */
public class Herd implements Movable {
    private List<Movable> herd;
    
    public Herd(){
        this.herd = new ArrayList<>();
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Movable m : this.herd){
            sb.append(m.toString());
            sb.append("\n");
        }
        
        return sb.toString();
    }
    
    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable m : this.herd){
            m.move(dx, dy);
        }
    }
    
}
