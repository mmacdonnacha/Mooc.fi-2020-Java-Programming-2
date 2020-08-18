
/**
 *
 * @author micheal
 */
public class ProductWarehouse extends Warehouse {
    private String productName;
    
    public ProductWarehouse(String productName, double capacity){
        // Creates an empty product warehouse. 
        // The name of the product and the capacity of the warehouse 
        // are provided as parameters.
        super(capacity);
        this.productName = productName;    
    }

    public String getName(){
        // Returns the name of the product.
        return this.productName;
    }
    
    
    
    public void setName(String newName){
        // sets a new name for the product.
        this.productName = newName;
    }

    @Override
    public String toString(){
        // Returns the state of the object represented as a 
        // string like this Juice: balance = 64.5, space left 123.5
        return this.productName + ": " + super.toString();
    }


}
