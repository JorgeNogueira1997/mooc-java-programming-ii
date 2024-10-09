/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorge
 */
import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {
    
    private Map<String, Item> hashMap;
    
    public ShoppingCart(){
        this.hashMap = new HashMap<>();
    }
    
    public void add(String product, int price) {
        if (!this.hashMap.containsKey(product)) {
            this.hashMap.put(product, new Item(product, 1, price));
        } else {
            Item aux = this.hashMap.get(product);
            aux.increaseQuantity();
        }
    }
    
    public int price(){
        int aux = 0;
        for(Item x : this.hashMap.values()){
            aux += x.price();
        }
        return aux;
    }

    public void print(){
        for(Item x : hashMap.values()){
            System.out.println(x);
        }
    }
    
}
