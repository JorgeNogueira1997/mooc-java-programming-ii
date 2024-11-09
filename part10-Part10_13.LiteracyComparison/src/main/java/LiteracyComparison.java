
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        
        // V1
//        List<String> literacyContent = new ArrayList<>();
//        List<String> content = new ArrayList<>();
//        
//        try {
//            Files.lines(Paths.get("literacy.csv")).forEach(row -> literacyContent.add(row));
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
//        System.out.println(literacyContent);
//        System.out.println("");
//        System.out.println("");
//        
//        // theme, age group, gender, country, year, literacy percent
//        // Adult literacy rate, population 15+ years, male (%),Nigeria,2015,69.18883
//        // Niger (2015), female, 11.01572
//        
//        ArrayList<String> splitedContent = literacyContent.stream()
//                .map(row -> row.trim())
//                .map(row -> row.split(","))
//                .map(parts -> parts[3] + " (" + Integer.parseInt(parts[4]) + ")," + parts[2].replace(" (%)", "") + ", " + Double.parseDouble(parts[5]) + "\n") 
//                .sorted((x, y) -> {
//                    Double literacyPercentX = Double.valueOf(x.split(",")[2].trim()); // * 
//                    Double literacyPercentY = Double.valueOf(y.split(",")[2].trim());
//                    return literacyPercentX.compareTo(literacyPercentY);
//                })
//                .collect(Collectors.toCollection(ArrayList::new)); 
//        
//        
//        // [0]                                   [1]       [2] <-- .trim() *
//        // United Republic of Tanzania (2015), female, 76.08978,
//        // Zimbabwe (2015), female, 85.28513,
//        
//        System.out.println(splitedContent);
      
        
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .sorted((x, y) -> x[5].compareTo(y[5]))
                    .forEach(parts -> System.out.println(parts[3] + " (" + Integer.parseInt(parts[4]) + ")," + parts[2].replace(" (%)", "") + ", " + Double.parseDouble(parts[5])));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
        
        
    }
}
