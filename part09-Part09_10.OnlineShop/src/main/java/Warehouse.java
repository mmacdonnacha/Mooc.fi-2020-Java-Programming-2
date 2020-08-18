import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author micheal
 */
public class Warehouse {
    private Map<String, Integer> price;
    private Map<String, Integer> stock;
    
    public Warehouse(){
        this.price = new HashMap<>();
        this.stock = new HashMap<>();
    }
    
    
    public void addProduct(String product, int price, int stock){
        // which adds a product to the warehouse with the price and stock balance 
        // given as parameters.
        this.price.put(product, price);
        this.stock.put(product, stock);
    }
    
    public int price(String product){
        // which returns the price of the product it received as a parameter. 
        // If the product hasn't been added to the warehouse, 
        // the method must return -99.
        if(this.price.containsKey(product)){
            return this.price.get(product);
        }
        
        return -99;   
    }
    
    
    public int stock(String product){
        // returns the current remaining stock of the product in the warehouse. 
        // If the product hasn't been added to the warehouse,
        // the method must return 0.
        if(this.stock.containsKey(product)){
            return this.stock.get(product);
        }
        
        return 0;   
    }
    
    public boolean take(String product){
        // reduces the stock remaining for the product it received as a 
        // parameter by one, and returns true if there was stock remaining. 
        // If the product was not available in the warehouse 
        // the method returns false. 
        // A products stock can't go below zero.
        boolean hasProduct = this.stock.containsKey(product);
                
        if(!hasProduct || this.stock.get(product) == 0){
            return false;
        }
        
        int newStock = this.stock.get(product) - 1;
        this.stock.put(product, newStock);
        
        if(newStock == 0){
            return false;
        }
        
        return true;
        
    }
    
    
    public Set<String> products(){
        // returns the names of the products in the warehouse as a Set
        return this.stock.keySet();
    }

}