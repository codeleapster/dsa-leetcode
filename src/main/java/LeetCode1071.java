/**
 * <a href="https://leetcode.com/problems/greatest-common-divisor-of-strings/">1071. Greatest Common Divisor of Strings</a>
 */
public class LeetCode1071 {
    public String approachOne(String str1, String str2) {
        String base = str1.length() < str2.length() ? str1 : str2;

        for(int i=base.length(); i>=1; i--) {
            if(valid(str1, str2, base)) {
                return base;
            } else {
                base = base.substring(0, i-1);
            }
        }
        return base;
    }

    private boolean valid(String s1, String s2, String gcd) {
        int g = gcd.length();
        int m = s1.length();
        int n = s2.length();

        if(m % g == 0 && n % g == 0) {
            return s1.replace(gcd, "").isEmpty() && s2.replace(gcd, "").isEmpty();
        }
        return false;
    }

    public String approachTwo(String str1, String str2) {
        // Check if they have non-zero GCD string.
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Get the GCD of the two lengths.
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    private int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }
}
