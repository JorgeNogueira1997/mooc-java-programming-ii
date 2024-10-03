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

public class Abbreviations {
    
    private HashMap<String, String> hashMap;
    
    public Abbreviations(){
        this.hashMap = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        hashMap.put(abbreviation, explanation);
    }
    
    
    public boolean hasAbbreviation(String abbreviation){
        if(this.hashMap.containsKey(abbreviation)){
            return true;
        }
        return false;
    }
    
    
    public String findExplanationFor(String abbreviation){
        String aux = this.hashMap.get(abbreviation);
        if(aux != null){
            return aux;
        }
        return null;
    }
    
}
