
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        Container container = new Container();
        System.out.println(container);

        container.add(50);
        System.out.println(container);
        System.out.println(container.contains());

        container.remove(60);
        System.out.println(container);

        container.add(200);
        System.out.println(container);
         */
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("");

            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);
            System.out.print("> ");

            String input = scan.nextLine();
            String[] split = input.split(" ");

            if (input.equals("quit")) {
                break;
            } else {
                String command = split[0];
                int value = Integer.valueOf(split[1]);

                if (command.equals("add")) {
                    firstContainer.add(value);

                } else if (command.equals("move")) {

                    if (!(firstContainer.contains() == 0)) {

                        if (value > firstContainer.contains()) {
                            int toMove = firstContainer.contains();
                            firstContainer.remove(value);
                            secondContainer.add(toMove);
                        } else {
                            firstContainer.remove(value);
                            secondContainer.add(value);
                        }
                    }

                } else if (command.equals("remove")) {

                    secondContainer.remove(value);
                }
            }
        }
    }
}
