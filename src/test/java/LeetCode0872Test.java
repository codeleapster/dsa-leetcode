import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0872Test {

    public static Stream<Arguments> inputAndResult() {
        return Stream.of(
                Arguments.of(new Integer[]{3,5,1,6,2,9,8,null,null,7,4}, new Integer[]{3,5,1,6,7,4,2,null,null,null,null,null,null,9,8}, true), // leetcode test case 1
                Arguments.of(new Integer[]{1,2,3}, new Integer[]{1,3,2}, false) // leetcode test case 2
        );
    }

    // Helper method to convert array representation of a tree into a TreeNode
    private static LeetCode0872.TreeNode arrayToTree(Integer[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        LeetCode0872.TreeNode root = new LeetCode0872.TreeNode(arr[0]);
        buildTree(root, arr, 0);
        return root;
    }

    // Helper method to build the tree recursively from an array
    private static void buildTree(LeetCode0872.TreeNode node, Integer[] arr, int index) {
        if (node == null) return;

        int leftIndex = 2 * index + 1;
        int rightIndex = 2 * index + 2;

        if (leftIndex < arr.length && arr[leftIndex] != null) {
            node.left = new LeetCode0872.TreeNode(arr[leftIndex]);
            buildTree(node.left, arr, leftIndex);
        }

        if (rightIndex < arr.length && arr[rightIndex] != null) {
            node.right = new LeetCode0872.TreeNode(arr[rightIndex]);
            buildTree(node.right, arr, rightIndex);
        }
    }

    @ParameterizedTest
    @MethodSource("inputAndResult")
    void leafSimilar(Integer[] arr1, Integer[] arr2, boolean expected) {
        LeetCode0872.TreeNode root1 = arrayToTree(arr1);
        LeetCode0872.TreeNode root2 = arrayToTree(arr2);
        assertEquals(expected, new LeetCode0872().leafSimilar(root1, root2));
    }
}