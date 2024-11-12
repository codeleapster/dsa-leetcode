public class LeetCode0151 {

    // Using java libraries
    public String approachOne(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i] != null && !words[i].isEmpty()) {
                sb.append(words[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }

    // Using two pointers approach
    public String approachTwo(String input) {
        // trim trailing and leading spaces
        input = input.trim();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int start = 0;
        int end = 0;
        while (i < input.length()) {
            start = i;
            // find end of the word
            while (i < input.length() && input.charAt(i) != ' ') {
                i++;
            }
            end = i;

            String word = input.substring(start, end);
            sb.insert(0, " "); // add space between words
            sb.insert(0, word); // insert word at the beginning to maintain reverse order

            // skip the spaces between the words
            while (i < input.length() && input.charAt(i) == ' ') {
                i++;
            }
        }
        return sb.toString().trim();
    }
}
