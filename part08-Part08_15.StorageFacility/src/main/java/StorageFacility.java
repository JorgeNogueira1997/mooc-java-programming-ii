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
import java.util.ArrayList;

public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> hashMap;
    
    public StorageFacility(){
        this.hashMap = new HashMap<>();
    }
    
    public void add(String unit, String item){
        if(!this.hashMap.containsKey(unit)){
           this.hashMap.put(unit, new ArrayList<>());
        }
        this.hashMap.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit){
        if(this.hashMap.containsKey(storageUnit)){
            return this.hashMap.get(storageUnit);
        }
        return new ArrayList<>();
    }

    public void remove(String storageUnit, String item){
        if(this.hashMap.containsKey(storageUnit)){
            this.hashMap.get(storageUnit).remove(item);
        }
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> aux = new ArrayList<>();
        
        for(String x : this.hashMap.keySet()){
            if(!this.hashMap.get(x).isEmpty()){
                aux.add(x);
            }
        }
        return aux;
    }

    
}
