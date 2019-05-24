import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MianMethod {
    public static void main(String[] args){
        String s = "25525511135";
        RestoreIPAdresses rsIP = new RestoreIPAdresses();
        List<String> addresses = rsIP.restoreIpAddresses(s);
        System.out.println(addresses.toString());
    }
}
