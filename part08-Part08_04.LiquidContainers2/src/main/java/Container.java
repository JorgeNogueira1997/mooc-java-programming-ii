/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorge
 */
public class Container {

    int content;

    public Container() {
        this.content = 0;
    }

    public int contains() {
        return this.content;
    }

    public void add(int amount) {
        if (amount > 0) {
            int aux = this.content + amount;
            if (aux >= 100) {
                this.content = 100;
            } else {
                this.content += amount;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0 && this.content > 0) {
            if (amount > this.content) {
                this.content = 0;
            } else {
                this.content -= amount;
            }
        }
    }

    @Override
    public String toString() {
        return this.content + "/100";
    }

}
