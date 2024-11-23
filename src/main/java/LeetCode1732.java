public class LeetCode1732 {
    public int largestAltitude(int[] gain) {
        // highest = 0
        // current = 0
        // for i = 0 to n-1
        //      current = current + gain[i]
        //      highest = max(current, highest)
        // highest

        int highest = 0;
        int current = 0;

        for (int i=0; i < gain.length; i++) {
            current = current + gain[i];
            highest = Integer.max(current, highest);
        }
        return highest;
    }
}
