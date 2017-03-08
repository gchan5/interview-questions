/**
 *  Problem (from Leetcode #513):
 *  Given a binary tree, find the leftmost value in the last row of the tree.
 *
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {
    /* need something to store current depth, and current value */
    private class Holder {
        int val;
        int depth;

        Holder(){
            val = 0;
            depth = 0;
        }
    }

    public int findBottomLeftValue(TreeNode root) {
        Holder h = new Holder();
        h.val = root.val;

        helper(root, h, 0);

        return h.val;
    }

    public void helper(TreeNode root, Holder holder, int depth){
        if(root == null){
            return;
        }

        /* update value in holder if depth is higher */
        if(depth > holder.depth){
            holder.val = root.val;
            holder.depth = depth;
        }

        /* increment depth by 1 */
        helper(root.left, holder, depth + 1);
        helper(root.right, holder, depth + 1);
    }
}
