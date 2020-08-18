
/**
 *
 * @author micheal
 */
public class Teacher extends Person {
    private int salary;
    
    public Teacher(String name, String address, int wages){
        super(name, address);
        this.salary = wages;
    }
    
    
    @Override 
    public String toString(){
        return super.toString() + "\n  salary " + this.salary + " euro/month"; 
    }
    
}
