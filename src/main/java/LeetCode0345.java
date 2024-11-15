public class LeetCode0345 {

    public String approachOne(String s) {
        char[] input = s.toCharArray();
        int n = s.length() - 1;
        int x = 0, y = n;
        String vowels = "aAeEiIoOuU";
        while (x < y) {
            while (x < y && vowels.indexOf(input[x]) == -1) {
                x++;
            }
            while (x < y && vowels.indexOf(input[y]) == -1) {
                y--;
            }

            if (x < y) {
                char temp = input[x];
                input[x] = input[y];
                input[y] = temp;
            }
            x++;
            y--;
        }
        return new String(input);
    }

    public String approachTwo(String s) {
        char[] input = s.toCharArray();
        int n = s.length() - 1;
        int x = 0, y = n;
        String vowels = "aAeEiIoOuU";
        while (x < y) {
            while (x < y && !isVowel(input[x])) {
                x++;
            }
            while (x < y && !isVowel(input[y])) {
                y--;
            }

            if (x < y) {
                swap(input, x, y);
            }
            x++;
            y--;
        }
        return new String(input);
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    private void swap(char[] c, int x, int y) {
        char temp = c[x];
        c[x] = c[y];
        c[y] = temp;
    }
}
