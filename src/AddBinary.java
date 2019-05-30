/**
 * Given two binary strings, return their sum (also a binary string).
 * The input strings are both non-empty and contains only characters 1 or 0.
 *
 * Example 1:
 * Input: a = "11", b = "1"
 * Output: "100"
 *
 * Example 2:
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || carry == 1){
            if (i >= 0 && a.charAt(i--) == '1'){
                carry++;
            }
            if (j >= 0 && b.charAt(j--) == '1'){
                carry++;
            }
            sb.append(carry % 2);
            carry /= 2;
        }
        return sb.reverse().toString();
    }
}
