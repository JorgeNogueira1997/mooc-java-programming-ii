
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }

        if (this.year == other.year
                && this.month == other.month
                && this.day < other.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }
    
    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        
        if(this.getClass() != object.getClass()){
            return false;
        }
        
        SimpleDate aux = (SimpleDate) object;
        
        if(this.day == aux.day &&
            this.month == aux.month &&
            this.year == aux.year){
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        if (this.year >= 1900 && this.year <= 2100) {
            return this.day + (this.month * 100) + (this.year * 100);
        }

        return this.day;
    }
    

}
