import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode1346 {

    // TC: O(n^2)
    // SC: O(1)
    public boolean bruteForce(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (i != j && (arr[i] == 2 * arr[j] || arr[j] == 2 * arr[i])) {
                    return true;
                }
            }
        }

        return false;
    }

    // TC: O(n)
    // SC: O(n)
    public boolean usingHashSet(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int num: arr) {
            if(set.contains(2*num) || (num%2 == 0 && set.contains(num/2))) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    // TC: O(n log n)
    // SC: O(log n)
    public boolean usingSortAndBinarySearch(int[] arr) {
        Arrays.sort(arr);

        for(int i=0; i< arr.length; i++) {
            int idx = Arrays.binarySearch(arr, 2 * arr[i]);
            if (idx != i && idx >= 0) {
               return true;
            }
        }

        return false;
    }
}