
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PositiveNumbers {

    public static List<Integer> positive(List<Integer> numbers){
        return numbers.stream()
                .filter(x -> x > 0)
                .collect(Collectors.toList());
                //.collect(Collectors.toCollection(ArrayList::new));
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

        List<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(-2);
        list.add(-3);
        list.add(0);
        list.add(6);
        list.add(8);
        list.add(12);
        list.add(23);
        
        System.out.println(positive(list));
    }

}
