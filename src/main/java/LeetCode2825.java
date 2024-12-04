public class LeetCode2825 {
    public boolean canMakeSubsequence(String str1, String str2) {
        int j = 0;
        for(int i = 0; i < str1.length() && j < str2.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(j);
            if(c1 == c2 || nextChar(c1) == c2) {
                j++;
            }
        }
        return j == str2.length();
    }

    public char nextChar(char c) {
        if(c == 'z') {
            return 'a';
        }
        return (char)(c+1);
    }

}
