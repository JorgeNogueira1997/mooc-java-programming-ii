/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorge
 */
public class Student extends Person{
    
    private int credits;
    
    public Student(String name, String street){
        super(name, street);
        this.credits = 0;
    }
    
    public void study(){ this.credits+=1; }
    public int credits(){ return this.credits; }
    
    @Override
    public String toString(){
        return super.getName() + "\n" + 
                "  " + super.getStreet() + "\n" + 
                "  Study credits " + this.credits;
    }
    
}
