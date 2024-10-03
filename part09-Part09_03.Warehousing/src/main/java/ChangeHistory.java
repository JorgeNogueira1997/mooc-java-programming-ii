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

// Part 3:
public class ChangeHistory {
    
    private ArrayList<Double> arrayList;
    
    public ChangeHistory(){
        this.arrayList = new ArrayList<>();
    }

    public void add(double status){ this.arrayList.add(status); }
    public void clear(){ this.arrayList.clear(); }

    @Override
    public String toString(){
        return this.arrayList.toString();
    }
    
    // Part 4:
    public double maxValue(){
        if(!this.arrayList.isEmpty()){
            double max = this.arrayList.get(0);
            for(Double x : this.arrayList){
                if(x > max){
                    max = x;
                }
            }
            return max;
        }
        return 0;
    }

    public double minValue(){
        if(!this.arrayList.isEmpty()){
            double min = this.arrayList.get(0);
            for(Double x : this.arrayList){
                if(x < min){
                    min = x;
                }
            }
            return min;
        }
        return 0;
    }

    public double average(){
        if(!this.arrayList.isEmpty()){
            double count = 0;
            for(Double x : this.arrayList){
                count += x;
            }
            return count / this.arrayList.size();
        }
        return 0;
    }
    
}
