
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here

        List<String> inputs = new ArrayList<>();
        
        System.out.println("Input numbers, type \"end\" to stop.");
        while(true){
            String userInput = scanner.nextLine();
            if(userInput.equals("end")){
                break;
            }else{
                inputs.add(userInput);                
            }
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String userInput = scanner.nextLine();
        
        if(userInput.equals("n")){
            double averageNegativeNumbers = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();
            
            System.out.println("Average of the negative numbers: " + averageNegativeNumbers);
            
        }else if(userInput.equals("p")){
            double averagePositiveNumbers = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number > 0)
                .average()
                .getAsDouble();
            
            System.out.println("Average of the negative numbers: " + averagePositiveNumbers);
        }
        
        
        
    }
}
