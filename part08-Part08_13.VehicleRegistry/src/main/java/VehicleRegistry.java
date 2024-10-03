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

// Part 2
public class VehicleRegistry {
    
    private HashMap<LicensePlate,String> hashMap;
    
    public VehicleRegistry(){
        this.hashMap = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if(!this.hashMap.containsKey(licensePlate)){
            this.hashMap.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate){
        if(this.hashMap.containsKey(licensePlate)){
            return this.hashMap.get(licensePlate);
        }
        return null;
    }

    public boolean remove(LicensePlate licensePlate){
        if(this.hashMap.containsKey(licensePlate)){
            this.hashMap.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    
    // Part 3:
    public void printLicensePlates(){
        //System.out.println(this.hashMap.entrySet());
        for(LicensePlate x : this.hashMap.keySet()){
            System.out.println(x);
        }
    }
    
    public void printOwners(){
        // since the same name should not be repeated:
        
        ArrayList<String> ownerNames = new ArrayList<>();
        
        for(String x : this.hashMap.values()){
            if(!ownerNames.contains(x)){
                ownerNames.add(x);
            }
        }
        
        for(String y : ownerNames){
            System.out.println(y);
        }
        
    }
    
}
