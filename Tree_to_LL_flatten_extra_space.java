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
    public void flatten(TreeNode root) {
        if(root==null) return;
        Deque<TreeNode> sk=new ArrayDeque<>();
        sk.push(root);
        while(!sk.isEmpty()){
            TreeNode cur=sk.pop();
            if(cur.right!=null) sk.push(cur.right);
            if(cur.left!=null) sk.push(cur.left);
            if(!sk.isEmpty()) cur.right=sk.peek();
            cur.left=null;
            
        }
    }
}