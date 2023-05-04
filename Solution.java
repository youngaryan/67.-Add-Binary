public class Solution {
    public String addBinary(String a, String b) {
        int aInt = Integer.parseInt(a,2);
        int bInt = Integer.parseInt(b,2);
        int result = aInt+bInt;

        return Integer.toBinaryString(result);
    }
}
