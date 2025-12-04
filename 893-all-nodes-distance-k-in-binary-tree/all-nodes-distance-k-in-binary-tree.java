/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> result = new ArrayList<>();
    Map<TreeNode, TreeNode> parentmap = new HashMap<>();
    Set<TreeNode> visited = new HashSet<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        build(root);
        findTarget(target, 0, k);
        return result;
    }

    public void build(TreeNode root){
        if(root.left != null){
            parentmap.put(root.left, root);
            build(root.left);
        }
        if(root.right != null){
            parentmap.put(root.right, root);
            build(root.right);
        }
    }

    public void findTarget(TreeNode root, int distance, int k){
        if(root == null || visited.contains(root)){
            return;
        }
        visited.add(root);

        if(distance == k){
            result.add(root.val);
            return;
        }
        if(root.left != null){
            findTarget(root.left, distance + 1, k);
        }
        if(root.right != null){
            findTarget(root.right, distance + 1, k);
        }
        if(parentmap.get(root) != null){
            findTarget(parentmap.get(root), distance + 1, k);
        }
    }
}