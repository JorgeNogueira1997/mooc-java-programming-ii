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

public class Herd implements Movable{
    
    private ArrayList<Movable> arrayList;
    
    public Herd(){
        this.arrayList = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        this.arrayList.add(movable);
    }
    
    @Override
    public void move(int dx, int dy){
        for(Movable x : this.arrayList){
            x.move(dx, dy);
        }
    }
    
    @Override
    public String toString(){
        String aux = "";
        for(Movable x : this.arrayList){
            aux += x.toString() + "\n";
        }
        return aux;
    }
    
}
