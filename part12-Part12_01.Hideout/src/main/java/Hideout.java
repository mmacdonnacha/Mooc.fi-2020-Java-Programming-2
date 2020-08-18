/**
 *
 * @author micheal
 */
public class Hideout<T> {
    private T hidden;
    boolean isHidden;
    
    public Hideout(){
        this.isHidden = false;
    }
    
    public void putIntoHideout(T toHide){
        this.hidden = toHide;
        this.isHidden = true;
    }
    
    public T takeFromHideout(){
        if(!this.isHidden){
            this.hidden = null;
            return this.hidden;
        }
        
        this.isHidden = false;
        return this.hidden;
    }
    
    public boolean isInHideout(){
        return this.isHidden;
    }
}
