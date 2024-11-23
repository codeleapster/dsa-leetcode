import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // create hashmap of nums1
        //      for i -> 0 to n1
        //          hashmap1.put nums1[i]
        // create hashmap of nums2
        //      for i -> 0 to n2
        //          hashmap2.put nums2[i]
        //          create list2
        //                if (!hashmap1.contains nums2[i])
        //                      list2.add(nums2[i])
        // create list1
        //      for i->0 to n1
        //          if (!hashmap2.contains nums1[i])
        //              list1.add(nums1[i])
        // return list of list1 and list2

        Set<Integer> set1 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int i : nums2) {
            set2.add(i);
        }

        List<Integer> list1 = new ArrayList<>();
        for (Integer i : set1) {
            if (!set2.contains(i)) {
                list1.add(i);
            }
        }

        List<Integer> list2 = new ArrayList<>();
        for (int i : set2) {
            if (!set1.contains(i)) {
                list2.add(i);
            }
        }

        List<List<Integer>> output = new ArrayList<>();
        output.add(list1);
        output.add(list2);
        return output;
    }
}
