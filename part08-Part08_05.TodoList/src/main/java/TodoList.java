
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jorge
 */
public class TodoList {

    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
        this.list.add(null); // first is null
    }

    public void add(String task) {
        this.list.add(task); // will add on index 1
    }

    public void print() {
        int index = 1;
        while (index < this.list.size()) {
            System.out.println(index + ": " + this.list.get(index));
            index += 1;
        }
    }

    public void remove(int number) {
        int index = 1;
        while (index < this.list.size()) {
            if( index == number ){
                this.list.remove(index);
            }
            index += 1;
        }
    }

}
