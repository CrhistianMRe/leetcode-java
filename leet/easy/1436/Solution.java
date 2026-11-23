import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Solution {

    public String destCity(List<List<String>> paths) {
        HashSet<String> originSet = new HashSet<>();

        String result = null;


        paths.forEach(path -> {

            String origin = path.get(0);

            
            originSet.add(origin);

        });

        for(List<String> path : paths) {

            String destination = path.get(1);


            if(!originSet.contains(destination)) {
                result = destination;
                break;
            };

        }

        return result;
    }
    

        
}
