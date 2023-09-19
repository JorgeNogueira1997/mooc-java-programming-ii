
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        
        HashMap<String,String> storeNames = new HashMap<>();
        
        storeNames.put("matthew","matt");
        storeNames.put("michael","mix");
        storeNames.put("arthur","artie");
        
        System.out.println(storeNames.get("matthew"));
        
        
    }

}
