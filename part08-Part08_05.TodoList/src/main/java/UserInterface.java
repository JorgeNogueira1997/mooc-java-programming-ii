
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorge
 */
public class UserInterface {
    
    private Scanner scanner;
    private TodoList todoList;
    
    public UserInterface(TodoList todoList, Scanner scanner){
        this.scanner = scanner;
        this.todoList = todoList;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String inputUser = this.scanner.nextLine();
            
            if(inputUser.equals("stop")){
                break;
            }else if(inputUser.equals("add")){
                System.out.print("To add: ");
                String toAdd = this.scanner.nextLine();
                this.todoList.add(toAdd);
                
            }else if(inputUser.equals("list")){
                this.todoList.print();
                
            }else if(inputUser.equals("remove")){
                System.out.print("Which one is removed? ");
                int toRemove = Integer.valueOf(this.scanner.nextLine());
                this.todoList.remove(toRemove);
                
            }
        }
    }
    
}
