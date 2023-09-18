
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            System.out.print("> ");
            String input = scan.nextLine();
            String[] parts = input.split(" ");

            if (input.equals("quit")) {
                break;
            } else {
                String command = parts[0];
                int value = Integer.valueOf(parts[1]);

                if (command.equals("add")) {
                    int addAmount = Integer.valueOf(parts[1]);

                    // add x number to first container
                    if (addAmount > 0) {
                        int auxSum = firstContainer + addAmount;
                        if (auxSum >= 100) {
                            firstContainer = 100; // max 
                        } else {
                            firstContainer += addAmount;
                        }
                    }

                } else if (command.equals("move")) {
                    // move from first container to the second
                    int moveAmount = Integer.valueOf(parts[1]);

                    if (!(firstContainer == 0)) {
                        if (moveAmount > 0) {
                            int auxSum = secondContainer + moveAmount;
                            if (auxSum >= 100) {
                                firstContainer = 0;
                                secondContainer = 100; // max
                            } else if (moveAmount > firstContainer) { // move all
                                int auxDifference = moveAmount - firstContainer;
                                int toMove = moveAmount - auxDifference;
                                
                                firstContainer = 0;
                                secondContainer += toMove;
                            } else {
                                firstContainer -= moveAmount;
                                secondContainer += moveAmount;
                            }
                        }
                    }

                } else if (command.equals("remove")) {
                    // removes from second container 
                    int removeAmount = Integer.valueOf(parts[1]);

                    if (removeAmount > 0) {
                        if (removeAmount > secondContainer) {
                            secondContainer = 0; // remove all
                        } else {
                            secondContainer -= removeAmount;
                        }
                    }

                }
            }
        }
    }

}
