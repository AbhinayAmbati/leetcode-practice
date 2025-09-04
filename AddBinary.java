import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger n = new BigInteger(a,2);
        BigInteger m = new BigInteger(b,2);
        BigInteger c = n.add(m);
        return c.toString(2);
    }
}