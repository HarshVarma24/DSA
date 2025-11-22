/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>> result = new LinkedList<>();

        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> nextStack = new Stack<>();
        boolean leftToRight = true;

        stack.push(root);

        while (!stack.isEmpty()) {
            int len = stack.size();
            List<Integer> sublist = new LinkedList<>();

            for (int i = 0; i < len; i++) {
                TreeNode node = stack.pop();
                sublist.add(node.val);

                // Push children based on direction
                if (leftToRight) {
                    if (node.left != null) nextStack.push(node.left);
                    if (node.right != null) nextStack.push(node.right);
                } else {
                    if (node.right != null) nextStack.push(node.right);
                    if (node.left != null) nextStack.push(node.left);
                }
            }

            result.add(sublist);

            // Swap stacks
            Stack<TreeNode> temp = stack;
            stack = nextStack;
            nextStack = temp;

            // Reverse direction
            leftToRight = !leftToRight;
        }

        return result;
    }
}
