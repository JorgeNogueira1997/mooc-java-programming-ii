/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorge
 */
import java.util.ArrayList;

public class Box implements Packable{
    
    private double maximumCapacity;
    private ArrayList<Packable> storage;
    //private double weight;

    public Box(double maximumCapacity){
        this.storage = new ArrayList<>();
        this.maximumCapacity = maximumCapacity;
        //this.weight = 0;
    }
    
    public void add(Packable x) {        
        System.out.println("maximumCapacity: " + this.maximumCapacity);
        System.out.println("x.weight(): " + x.weight());
        
        double aux = x.weight() + this.weight();
        if (aux <= this.maximumCapacity) {
            this.storage.add(x);
            //this.weight += x.weight();
        }
    }
    
    @Override
    public double weight(){
        double weight = 0;
        
        for(Packable x : this.storage){
            weight += x.weight();
        }
        
        return weight;
    }
    
    @Override
    public String toString(){
        return "Box: " + this.storage.size() +" items, total weight " + this.weight() + " kg";
    }
    
}
