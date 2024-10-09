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
import java.util.Set;
import java.util.HashSet;

public class Item {
    
    private Map<String, Integer> hashMap;
    private Map<String, Integer> unitPriceHashMap;
    
    public Item(String product, int qty, int unitPrice){
        this.hashMap = new HashMap<>();
        this.unitPriceHashMap = new HashMap<>();
        
        this.hashMap.put(product, qty);
        this.unitPriceHashMap.put(product, unitPrice);
    }
    
    public int price() {
        int totalPrice = 0;

        for (String product : this.hashMap.keySet()) {
            int quantity = this.hashMap.get(product);

            int unitPrice = this.unitPriceHashMap.get(product);

            totalPrice += quantity * unitPrice;
        }

        return totalPrice;
    }
    
    public void increaseQuantity(){
        for(String x : this.hashMap.keySet()){
            this.hashMap.put(x, this.hashMap.get(x)+1);
        }
    }
    
    public String toString(){
        String aux = "";
        for(String x : this.hashMap.keySet()){
            aux = x + ": " + this.hashMap.get(x);
        }
        return aux;
    }

    
}
