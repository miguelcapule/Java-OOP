/**
 *
 * @author Miguel Capule
 */
package Main;

public class Product {
    
    String name;
    float price;
    
    Product(String name, float price){
    
        this.name = name;
        this.price = price;
    
        System.out.println(name + "Created");
        System.out.println("PHP. " + price);
    
    }
    
}
