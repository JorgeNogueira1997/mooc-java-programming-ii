
public class Human implements Comparable<Human>{

    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }


    @Override
    public String toString() {
        return name + " " + wage;
    }
    
    // smallest to biggest:
//    @Override
//    public int compareTo(Human x) {
//        if (this.wage == x.getWage()) {
//            return 0;
//        } else if (this.wage > x.getWage()) {
//            return 1;
//        } else {
//            return -1;
//        }
//    }
    
    // biggest to smallest:
    @Override
    public int compareTo(Human x) {
        if (this.wage == x.getWage()) {
            return 0;
        } else if (this.wage < x.getWage()) {
            return 1;
        } else {
            return -1;
        }
    }
    
    // smallest to biggest:
//    @Override
//    public int compareTo(Human x) {
//        return this.wage - x.getWage():
//    }
    
    // biggest to smallest:
//    @Override
//    public int compareTo(Human x) {
//        return x.getWage() - this.wage;
//    }
    
}
