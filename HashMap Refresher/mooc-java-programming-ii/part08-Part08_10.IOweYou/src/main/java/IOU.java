/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorge
 */
import java.util.HashMap;

public class IOU {
    
    private HashMap<String,Double> hashmap;
    
    public IOU(){
        this.hashmap = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        this.hashmap.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom){
        for(String x : this.hashmap.keySet()){
            if(x.equals(toWhom)){
                double aux = this.hashmap.get(x);
                return aux;
            }
        }
        return 0;
    }
    
    
}