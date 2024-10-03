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

public class DictionaryOfManyTranslations {
    
    private HashMap<String, ArrayList<String>> hashMap;
    
    public DictionaryOfManyTranslations(){
        this.hashMap = new HashMap<>();
    }
    
    public void add(String word, String translation){
        if(!this.hashMap.containsKey(word)){
            this.hashMap.put(word, new ArrayList<>());
        }
        this.hashMap.get(word).add(translation);
    }

    public ArrayList<String> translate(String word){
        if(this.hashMap.containsKey(word)){
            return this.hashMap.get(word);
        }
        return new ArrayList<>();
    }

    public void remove(String word){
        if(this.hashMap.containsKey(word)){
            this.hashMap.remove(word);
        }
    }

    
}
