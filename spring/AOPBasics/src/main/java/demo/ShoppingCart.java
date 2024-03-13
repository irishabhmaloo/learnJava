package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String status) {
        // logging
        // authenticate / authorize
        // sanitize the data
        System.out.println("Checkout called in ShoppingCart!");
    }
}
