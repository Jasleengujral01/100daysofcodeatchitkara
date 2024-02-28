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
    int res = -1;
    int prev = -1;
    void sol(TreeNode root , int level){
        if(root==null)
        return;
        if(level>prev){
            prev = level;
            res = root.val;
        }
        sol(root.left ,level+1);
        sol(root.right , level+1);
    }
    public int findBottomLeftValue(TreeNode root) {
        res = root.val;
        sol(root,0);
        return res;
    }
}