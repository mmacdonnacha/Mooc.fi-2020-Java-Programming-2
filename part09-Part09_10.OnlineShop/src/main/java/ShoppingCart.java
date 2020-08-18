import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author micheal
 */
public class ShoppingCart {
    private Map<String, Item> cart;
    
    public ShoppingCart(){
        this.cart = new HashMap<>();
    }
    
    
    public void add(String product, int price){
        // adds an item to the cart that matches the product given as a parameter, 
        // with the price given as a parameter.
        if(this.cart.containsKey(product)){
            this.cart.get(product).increaseQuantity();
        }else{         
            this.cart.put(product, new Item(product, 1, price));
        }
    }
    
    public int price(){
        // returns the total price of the shopping cart.
        if(this.cart.isEmpty()){
            return 0;
        }
        
        int sum = 0;
        for(Item item : this.cart.values()){
            sum += item.price();
        }
        
        return sum;
    }
    
    
    public void print(){
        for(Item item : this.cart.values()){
            System.out.println(item);
        }
    }
}
