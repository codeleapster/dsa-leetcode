import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode0104Test {

    public static Stream<Arguments> inputAndResult() {
        return Stream.of(
                Arguments.of(null, 0), // Test case 1: Empty tree
                Arguments.of(new Integer[]{1}, 1), // Test case 2: Single node
                Arguments.of(new Integer[]{1, 2, 3, 4, 5, 6, 7}, 3), // Test case 3: Balanced tree
                Arguments.of(new Integer[]{1, null, 2, null, null, null, 3, null, null, null, null}, 3), // Test case 4: Unbalanced (right heavy)
                Arguments.of(new Integer[]{1, 2, null, 3, null, null, null, 4}, 4), // Test case 5: Unbalanced (left heavy)
                Arguments.of(new Integer[]{3,9,20,null,null,15,7}, 3), // leetcode test case 1
                Arguments.of(new Integer[]{1,null,2}, 2) // leetcode test case 2
        );
    }

    // Helper method to convert array representation of a tree into a TreeNode
    private static LeetCode0104.TreeNode arrayToTree(Integer[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        LeetCode0104.TreeNode root = new LeetCode0104.TreeNode(arr[0]);
        buildTree(root, arr, 0);
        return root;
    }

    // Helper method to build the tree recursively from an array
    private static void buildTree(LeetCode0104.TreeNode node, Integer[] arr, int index) {
        if (node == null) return;

        int leftIndex = 2 * index + 1;
        int rightIndex = 2 * index + 2;

        if (leftIndex < arr.length && arr[leftIndex] != null) {
            node.left = new LeetCode0104.TreeNode(arr[leftIndex]);
            buildTree(node.left, arr, leftIndex);
        }

        if (rightIndex < arr.length && arr[rightIndex] != null) {
            node.right = new LeetCode0104.TreeNode(arr[rightIndex]);
            buildTree(node.right, arr, rightIndex);
        }
    }

    @ParameterizedTest
    @MethodSource("inputAndResult")
    void maxDepth(Integer[] treeArray, int expectedDepth) {
        LeetCode0104.TreeNode root = arrayToTree(treeArray);
        assertEquals(expectedDepth, new LeetCode0104().maxDepth(root));
    }
}