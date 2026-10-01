import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OptimalSolution {

    public int numUniqueEmails(String[] emails) {
        Set<String> cleanEmails = new HashSet<>();

        Arrays.stream(emails).forEach(email -> {
            String[] parts = email.split("@");
            String[] local = parts[0].split("\\+");
            cleanEmails.add(local[0].replace(".", "") + "@" + parts[0]);
        });


        return cleanEmails.size();

    }
    
}
