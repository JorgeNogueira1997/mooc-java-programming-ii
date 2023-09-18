
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int total = 0;
        double average = 0;
        boolean finish = false;

        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == 0) {
                if (total <= 1) {
                    System.out.println("Cannot calculate the average");
                    break;
                } else {
                    break;

                }
            } else {
                if (userInput > 0) {
                    total++;
                    sum += userInput;
                    finish = true;
                }

            }
        }

        if (finish) {
            average = (double) sum / total;
            System.out.println(average);
        }

    }
}
