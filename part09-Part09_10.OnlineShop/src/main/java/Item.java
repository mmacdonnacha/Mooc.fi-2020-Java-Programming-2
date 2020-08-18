
/**
 *
 * @author micheal
 */
public class Item {
    private String productName;
    private int quantity;
    private int pricePerUnit;
    
    public Item(String product, int qty, int unitPrice){
        this.productName = product;
        this.quantity = qty;
        this.pricePerUnit = unitPrice;
    }
    
    public int price(){
        // return the price of the item. 
        // You get the items price by 
        // multiplying its unit price by its quantity(qty).
        
        return this.pricePerUnit * this.quantity;
    }
    
    public void increaseQuantity(){
        // increases the quantity by one.
        this.quantity++;
    }
    
    @Override
    public String toString(){
        // returns the string representation of the item.
        
        return this.productName + ": " + this.quantity;
    }
}
