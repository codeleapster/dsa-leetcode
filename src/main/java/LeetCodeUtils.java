import java.util.List;

public class LeetCodeUtils {
    public static int[] toIntArray(List<Integer> list) {
        int[] out = new int[list.size()];
        for(int i = 0; i < out.length; i++) {
            out[i] = list.get(i);
        }
        return out;
    }
}
