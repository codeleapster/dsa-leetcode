import java.util.ArrayList;
import java.util.List;

public class LeetCode0872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        findLeaves(root1, list1);
        findLeaves(root2, list2);

        return list1.equals(list2);
    }

    private void findLeaves(TreeNode root, List<Integer> list) {
        if(root.left == null && root.right == null) {
            list.add(root.val);
            return;
        }
        if(root.left != null) {
            findLeaves(root.left, list);
        }
        if (root.right != null) {
            findLeaves(root.right, list);
        }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

