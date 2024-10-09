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

public class Warehouse {
    
    private Map<String, Integer> hashMap;
    private Map<String, Integer> prices; // stockHashMap
    
    public Warehouse(){
        this.hashMap = new HashMap<>();
        this.prices = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.hashMap.put(product, price);
        this.prices.put(product, stock);
    }
    
    public int price(String product){
        int aux = 0;
        for(String x : this.hashMap.keySet()){
            if(x.equals(product)){
                aux = this.hashMap.get(x);
            }
        }
        if(aux <= 0){
            aux = -99;
        }
        return aux;
    }
    
    // Part 2:
    public int stock(String product){
        for(String x : this.prices.keySet()){
            if(x.equals(product)){
                return this.prices.get(x);
            }
        }
        return 0;
    }
    
    public boolean take(String product){
        for(String x : this.prices.keySet()){
            if(x.equals(product)){
                int aux = this.prices.get(x);

                if(aux - 1 >= 0){
                    this.prices.put(x, aux-1);
                    return true;
                }else{
                  this.prices.put(x, 0);  
                  return false;
                }
            }
        }
        return false;
    }


    // Part 3:
    public Set<String> products(){
        Set<String> hashSet = new HashSet<>();
        
        for(String x : this.prices.keySet()){
            hashSet.add(x);
        }
        
        return hashSet;
    }
    
}
