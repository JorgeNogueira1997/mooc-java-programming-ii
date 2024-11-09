import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        
        // Part 1:
        Checker x = new Checker();
        
        boolean y = x.isDayOfWeek("tue");
        System.out.println(y);
        
        y = x.isDayOfWeek("abc");
        System.out.println(y);        
        
        // Part 2:
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        y = x.allVowels(userInput);
        System.out.println(y);
        
        // Part 3:
        System.out.print("Enter a string: ");
        userInput = scanner.nextLine();
        
        y = x.timeOfDay(userInput);
        System.out.println(y);
        
        
    }
}
