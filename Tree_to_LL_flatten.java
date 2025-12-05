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
   if(root == null){
      return;
    }

    Stack<TreeNode> stack = new Stack<>();

    TreeNode current = new TreeNode(-1, null, root);
    stack.push(root);

    while (!stack.isEmpty()){
      TreeNode element = stack.pop();

      if(element.right != null){
        stack.push(element.right);
      }

      if(element.left != null){
        stack.push(element.left);
      }

      current.right = element;
      current.left = null;
      current = current.right;
    }
    }
}