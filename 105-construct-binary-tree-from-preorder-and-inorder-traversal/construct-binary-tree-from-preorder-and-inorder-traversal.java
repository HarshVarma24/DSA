class Solution {

    int preIndex = 0;  // global pointer for preorder

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return helper(preorder, inorder, map, 0, inorder.length - 1);
    }

    private TreeNode helper(int[] preorder, int[] inorder,
                            Map<Integer, Integer> map, int left, int right) {

        if (left > right) return null;

        int rootVal = preorder[preIndex++];  // use global pointer
        TreeNode root = new TreeNode(rootVal);

        int mid = map.get(rootVal);

        root.left = helper(preorder, inorder, map, left, mid - 1);
        root.right = helper(preorder, inorder, map, mid + 1, right);

        return root;
    }
}
