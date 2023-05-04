

public class Solution {
    public String addBinary(String a, String b) {
        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();
        int resultA = 0;
        int resultB = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '1'){
                resultA += (int) Math.pow(2,i);
            }
        }

        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == '1') {
                resultB += (int) Math.pow(2,i);
            }
        }

        return Integer.toBinaryString(resultA+resultB);
    }
}
