

public class Warehouse {

    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        if (capacity > 0.0) {
            this.capacity = capacity;
        } else {
            this.capacity = 0.0;
        }

        this.balance = 0.0;
    }

    public double getBalance() { return this.balance; }
    public double getCapacity() { return this.capacity; }

    public double howMuchSpaceLeft() {
        return this.capacity - this.balance;
        //return Math.round((this.capacity - this.balance) * 10) / 10.0;
        /*
        Suppose the result is 11.299999999999955. To round it to 1 decimal place using Math.round(), we first multiply it by 10.
        This shifts the decimal point one place to the right, converting 11.299999999999955 to 112.99999999999955.
        Now that the number is 112.99999999999955, we apply Math.round(). This rounds the number to the nearest whole integer, giving 113.
        After rounding, we divide by 10 to shift the decimal point back to its original position. So, 113 / 10 gives 11.3.
        */
    }

    public void addToWarehouse(double amount) {
        if (amount < 0) {
            return;
        }
        if (amount <= howMuchSpaceLeft()) {
            this.balance = this.balance + amount;
        } else {
            this.balance = this.capacity;
        }
    }

    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0.0;
        }
        if (amount > this.balance) {
            double allThatWeCan = this.balance;
            this.balance = 0.0;
            return allThatWeCan;
        }

        this.balance = this.balance - amount;
        return amount;
    }

    public String toString() {
        return "balance = " + this.balance + ", space left " + howMuchSpaceLeft();
    }
}
