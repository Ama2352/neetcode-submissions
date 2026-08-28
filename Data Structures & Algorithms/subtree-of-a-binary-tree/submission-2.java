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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        boolean isSubTree = false;
        while(!st.isEmpty()) {
            TreeNode top = st.pop();
            if(top == null) continue;
            if(top.val == subRoot.val) {
                isSubTree = isSameTree(top, subRoot);
                if(isSubTree) return true;
            }
            if(top.left != null) {
                st.push(top.left);
            }
            if(top.right != null) {
                st.push(top.right);
            }
        }
        return isSubTree;
    }


    private boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null || p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
