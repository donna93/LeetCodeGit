import java.util.ArrayList;
import java.util.List;

/**
 * Given a string containing only digits, restore it by returning all possible valid IP address combinations.
 *
 * Example:
 *
 * Input: "25525511135"
 * Output: ["255.255.11.135", "255.255.111.35"]
 */
public class RestoreIPAdresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> addresses = new ArrayList<>();
        StringBuilder tempAddress = new StringBuilder();
        restore(0, tempAddress, addresses, s);
        return addresses;
    }
    public void restore(int k, StringBuilder tempAddress, List<String> addresses, String s){
        if(k == 4 || s.length() == 0){
            if (k == 4 && s.length() == 0){
                addresses.add(tempAddress.toString());
            }
            return;
        }

        for (int i = 0; i <= 2 && i < s.length(); i++){
            String part = s.substring(0, i + 1);
            if (i != 0 && part.charAt(0) == '0'){
                break;
            }
            if (Integer.valueOf(part) <= 255){
                if (tempAddress.length() != 0){
                    part = '.' + part ;
                }
                tempAddress.append(part);
                restore(k + 1, tempAddress, addresses, s.substring(i + 1));
                tempAddress.delete(tempAddress.length() - part.length(), tempAddress.length());
            }
        }
    }
}
