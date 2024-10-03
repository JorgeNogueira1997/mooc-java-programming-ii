/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorge
 */
public class Person {
    
    private String name, street;

    public Person(String name, String street){
        this.name = name;
        this.street = street;
    }
    
    public String getName(){ return this.name; }
    public String getStreet(){ return this.street; }
    
    public void setName(String name){ this.name = name; }
    public void setStreet(String street){ this.street = street; }
    
    @Override
    public String toString(){
        return this.name + "\n" + "  " + this.street;
    }
    
}
