import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorderHelper(root, res);
        return res;
    }

    private void inorderHelper(TreeNode node, List<Integer> res) {
        if (node == null) return;

        inorderHelper(node.left, res);
        res.add(node.val);
        inorderHelper(node.right, res);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = solution.inorderTraversal(root);
        System.out.println(result);  // Output: [1, 3, 2]
    }
}
