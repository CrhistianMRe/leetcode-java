import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {

        final int result = numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"});

        System.out.println(result);

    }

    public static int numUniqueEmails(String[] emails) {

        final int emailsListLength = emails.length;


        Set<String> uniqueEmails = new HashSet<>();

        for(int i = 0; i < emailsListLength; i++) {

            boolean hasDomainStarted = false;

            boolean isSkipActive = false;

            String currentEmail = emails[i];

            String cleanEmail = "";

            int currentEmailLength = currentEmail.length();

            for(int a = 0; a < currentEmailLength; a++) {

                char currentChar = currentEmail.charAt(a);

                if(hasDomainStarted || currentChar == '@') {
                    hasDomainStarted = true;
                    isSkipActive = false; 
                } 
                else if(currentChar == '+') { 
                    isSkipActive = true;
                    continue; 
                }
                else if(isSkipActive) { continue; }
                else if(!hasDomainStarted && currentChar == '.') { continue; }

                cleanEmail = cleanEmail.concat(String.valueOf(currentChar));

            }

            uniqueEmails.add(cleanEmail);

        }


        return uniqueEmails.size();
    }
    
        
} 
