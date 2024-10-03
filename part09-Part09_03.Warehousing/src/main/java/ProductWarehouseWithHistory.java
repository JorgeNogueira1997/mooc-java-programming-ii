/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorge
 */

// Part 5:
public class ProductWarehouseWithHistory extends ProductWarehouse{
    
    private ChangeHistory changeHistory;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        
        this.changeHistory = new ChangeHistory();
        changeHistory.add(initialBalance);
    }
    
    public String history(){
        return this.changeHistory.toString();
    }
    
    
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        changeHistory.add(super.getBalance());
    }

    public double takeFromWarehouse(double amount){
        double aux = super.takeFromWarehouse(amount);
        changeHistory.add(super.getBalance());
        return aux;
    }

    
    // Part 7:
    public void printAnalysis(){
        System.out.println(
        "Product: " + super.getName() + "\n" +
        "History: " + this.changeHistory + "\n" +
        "Largest amount of product: " + this.changeHistory.maxValue() + "\n" +
        "Smallest amount of product: " + this.changeHistory.minValue() + "\n" +   
        "Average: " + this.changeHistory.average()
        );
    }
    
}
