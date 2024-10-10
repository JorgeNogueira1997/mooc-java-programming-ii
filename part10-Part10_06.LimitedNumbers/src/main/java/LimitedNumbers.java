
import java.util.ArrayList;
import java.util.Scanner;

import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> userInputs = new ArrayList<>();
        
        while(true){
            int userInput = Integer.valueOf(scanner.nextLine());
            if(userInput < 0){
               break; 
            }else{
                userInputs.add(userInput);
            }
        }
        
//        ArrayList<Integer> aux = userInputs.stream()
//            .filter(x -> x >= 1 && x <= 5)
//            .collect(Collectors.toCollection(ArrayList::new));
        
        userInputs.stream()
            .filter(x -> x >= 1 && x <= 5)
            .forEach(y -> System.out.println(y));
        
    }
}
