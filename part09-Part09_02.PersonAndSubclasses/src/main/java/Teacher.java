/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorge
 */
public class Teacher extends Person{
    
    private int salary;
    
    public Teacher(String name, String street, int salary){
        super(name, street);
        this.salary = salary;
    }
    
    @Override
    public String toString(){
        return super.getName() + "\n" + 
                "  " + super.getStreet() + "\n" + 
                "  salary " + this.salary + " euro/month";
    }
    
}
