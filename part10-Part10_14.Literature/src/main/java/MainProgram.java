
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> userBooks = new ArrayList<>();
        
        while(true){
            System.out.print("Input the name of the book, empty stops: ");
            String userInput = scanner.nextLine();
            
            if(userInput.isEmpty()){
                break;
            }else{
                System.out.print("Input the age recommendation: ");
                String userAgeRecommendation = scanner.nextLine();
                
                userBooks.add(new Book(userInput, userAgeRecommendation));
                
            }
            
        }
        
        System.out.println(userBooks.size() + " books in total.");
        System.out.println("Books:");
        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getBookAge)
                .thenComparing(Book::getBookName);
        
        Collections.sort(userBooks, comparator);
        
        for(Book x : userBooks){
            System.out.println(x);
        }
        
    }

}
