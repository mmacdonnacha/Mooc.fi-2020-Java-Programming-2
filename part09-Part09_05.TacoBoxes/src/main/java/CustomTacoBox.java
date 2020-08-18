/**
 *
 * @author micheal
 */
public class CustomTacoBox implements TacoBox{
    private int tacos;
    
    public CustomTacoBox(int tacos){
        if(tacos < 0){
            this.tacos = 0;
        }else{
            this.tacos = tacos;
        }
    }
    
    @Override
    public int tacosRemaining(){
        return this.tacos;
    }
    
    @Override
    public void eat(){
        if(this.tacos > 0){
            this.tacos--;
        }
    }
    
}
