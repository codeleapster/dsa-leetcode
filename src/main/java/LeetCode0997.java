public class LeetCode0997 {
    public int findJudge(int n, int[][] trust) {
        int[] out = new int[n];
        int[] in = new int[n];
        for(int i=0; i < trust.length; i++) {
            out[trust[i][0]-1] = out[trust[i][0]-1] + 1;
            in[trust[i][1]-1] = in[trust[i][1]-1] + 1;
        }

        for(int i=0; i < n; i++) {
            if(out[i] == 0 && in[i] == n-1) {
                return i+1;
            }
        }
        return -1;
    }
}
