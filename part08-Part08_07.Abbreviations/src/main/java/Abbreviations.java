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
import java.util.Map;

public class Abbreviations {
    
    private Map<String, String> map;
    
    
    public Abbreviations(){
        this.map = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        this.map.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        if(this.map.containsKey(abbreviation)){
            return true;
        }
        return false;
        
        /*for(int i = 0; i < this.map.size(); ++i){
            if(this.map.get(i).contains(abbreviation)){
                return true;
            }
        }
        return false;*/
    }
    
    public String findExplanationFor(String abbreviation){
        if(this.map.containsKey(abbreviation)){
            return this.map.get(abbreviation);
        }
        return null;
        
        /*String aux = null;
        for(int i = 0; i < this.map.size(); ++i){
            aux = this.map.get(i);
            if( aux.contains(abbreviation) ){
                return aux;
            }
        }
        return aux;*/
    }
    
}
