/**
 * <a href="https://leetcode.com/problems/greatest-common-divisor-of-strings/">1071. Greatest Common Divisor of Strings</a>
 */
public class Leetcode1071 {
    public String gcdOfStrings(String str1, String str2) {
        String gcd = str1.length() < str2.length() ? str1 : str2;

        for(int i=gcd.length(); i>=1; i--) {
            if(valid(str1, str2, gcd)) {
                return gcd;
            } else {
                gcd = gcd.substring(0, i-1);
            }
        }
        return gcd;
    }

    private boolean valid(String s1, String s2, String gcd) {
        int g = gcd.length();
        int m = s1.length();
        int n = s2.length();

        return m % g == 0 && n % g == 0 && s1.replace(gcd, "").isEmpty() && s2.replace(gcd, "").isEmpty();
    }
}
