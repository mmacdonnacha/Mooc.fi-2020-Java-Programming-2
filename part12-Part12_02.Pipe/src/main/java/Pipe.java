import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author miche
 */
public class Pipe<T> {
    List<T> pipe;
    
    public Pipe(){
        this.pipe = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        this.pipe.add(value);
    }
    
    public T takeFromPipe(){
        if(isInPipe()){
            T item = this.pipe.get(0);
            this.pipe.remove(item);
            return item;
        }   
        return null;
    }
    
    public boolean isInPipe(){
        return !this.pipe.isEmpty();
    }
}
