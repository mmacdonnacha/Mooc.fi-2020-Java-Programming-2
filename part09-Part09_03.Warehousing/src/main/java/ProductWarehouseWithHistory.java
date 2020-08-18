
/**
 *
 * @author micheal
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        // creates a product warehouse.
        // The product name, capacity, and initial balance are provided as parameters. 
        // Set the initial balance as the initial balance of the warehouse,
        // as well as the first value of the change history.
        super(productName, capacity); 
        history = new ChangeHistory(); 
        this.addToWarehouse(initialBalance);
    }

    public String history() {
        // returns the product history like this [0.0, 119.2, 21.2]. 
        // Use the string representation of the ChangeHistory object as is.
        return history.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        // works just like the method in the Warehouse class, 
        // but we also record the changed state to the history. 
        // NB: the value recorded in the history should 
        // be the warehouse's balance after adding, not the amount added!
        super.addToWarehouse(amount);
        
        this.history.add(this.getBalance());
                
    }

    @Override
    public double takeFromWarehouse(double amount) {
        // works just like the method in the Warehouse class, 
        // but we also record the changed state to the history.
        // NB: the value recorded in the history should 
        // be the warehouse's balance after removing, not the amount removed!
        double output = super.takeFromWarehouse(amount);
        this.history.add(this.getBalance());
        
        return output;
    }
    
    
    public void printAnalysis(){
        // which prints history related information for the product 
        // in the way presented in the example.
        
        String output = "Product: " + this.getName()
                      + "\nHistory: " + this.history.toString()
                      + "\nLargest amount of product: " + this.history.maxValue()
                      + "\nSmallest amount of product: " + this.history.minValue()
                      + "\nAverage: " + this.history.average();
        
        System.out.println(output);
    }

}
