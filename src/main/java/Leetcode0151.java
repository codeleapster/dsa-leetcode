public class Leetcode0151 {
    public String approachOne(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1; i>=0; i--) {
            if(words[i] != null && !words[i].isEmpty()) {
                sb.append(words[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
