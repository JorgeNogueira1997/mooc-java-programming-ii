
import java.util.HashMap;

public class Program {

    public static void printKeys(HashMap<String,String> hashmap){
            System.out.println(hashmap.keySet());
    }
    
    public static void printKeysWhere(HashMap<String,String> hashmap, String text){
        for(String aux : hashmap.keySet()){
            if(aux.contains(text)) {
                System.out.println(aux);
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
        for(String aux : hashmap.keySet()){
            if(aux.contains(text)) {
                String value = hashmap.get(aux);
                System.out.println(value);
            }
        }
    }
    
    public static void main(String[] args) {
        // Test your program here!
        
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }

}
