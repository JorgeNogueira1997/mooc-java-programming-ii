public class Checker {
    
    
    // Part 1:
    // mon, tue, wed, thu, fri, sat, sun
    public boolean isDayOfWeek(String string){
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            System.out.println("The form is correct.");
            return true;
        } else {
            System.out.println("The form is incorrect.");
            return false;
        }
        
    }
    
    // Part 2:
    // a e i o u
    public boolean allVowels(String string){
        //if (string.matches("[a-u]*")) {
        //if (string.matches("a|e|i|o|u")) {
        //if (string.matches("[aeiou]")) {
        //if (string.matches("[a-e-i-o-u]")) {
        //if (string.matches("[a-e-i-o-u]+")) { // ok
        if (string.matches("[aeiou]+")) { // ok
            System.out.println("The form is correct.");
            return true;
        } else {
            System.out.println("The form is incorrect.");
            return false;
        }
    }
    
    // Part 3:
    // hh:mm:ss
    // acceptable values are between 00:00:00 and 23:59:59.
    // hours goes from 00 to 23
    // minutes and seconds goes from 00 to 59
    public boolean timeOfDay(String string){
        // [01][0-9] goes from 00 to 19
        // 2[0-3] goes from 20 to 23
        if (string.matches("([0-1][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]")) { 
            System.out.println("The form is correct.");
            return true;
        } else {
            System.out.println("The form is incorrect.");
            return false;
        }
    }
    
    
}
