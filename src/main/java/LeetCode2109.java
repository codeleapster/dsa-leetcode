public class LeetCode2109 {
    public String addSpaces(String s, int[] spaces) {
        char[] output = new char[s.length() + spaces.length];
        int spacesIndex = 0;
        int outputIndex = 0;
        for(int i = 0; i < s.length(); i++) {
            if(spacesIndex < spaces.length && i == spaces[spacesIndex]) {
                output[outputIndex++] = ' ';
                spacesIndex++;
            }
            output[outputIndex++] = s.charAt(i);
        }
        return new String(output);
    }
}