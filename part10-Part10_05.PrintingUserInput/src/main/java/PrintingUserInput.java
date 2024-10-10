
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> userInputs = new ArrayList<>();
        
        while(true){
            String userInput = scanner.nextLine();
            if(userInput.isEmpty()){
                break;
            }else{
                userInputs.add(userInput);
            }
        }
        
        
        String aux = userInputs.stream()
                        .reduce("", (previous, current) -> previous + current + "\n");
        
        System.out.println(aux);
        
        
    }
}
