import java.util.List;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        // test your method here

        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");

        System.out.println(returnSize(names));
        
    }
    
    private static int returnSize(List<String> names){ return names.size(); }

    // Implement here a method returnSize
    // which returns the size of the list given to it
    //as a parameter
}
