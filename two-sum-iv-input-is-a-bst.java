/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        
        TreeNode temp = new TreeNode();
        List<Integer> values = new ArrayList<Integer>();
        
        if (root.left == null && root.right == null)
        {
            return false;
        }
        
        inOrderTraverse(root, values);        
        
        for(int i = 0; i < values.size(); i++)
        {
            for(int j = i + 1; j < values.size(); j++)
            {
                if (values.get(i) + values.get(j) == k)
                {
                    return true;
                }                
            }
        }
        
        return false;
        
    }
    
    public void inOrderTraverse(TreeNode node, List values)
    {
        if (node == null)
        {
            return;
        }
        
        inOrderTraverse(node.left, values);
        inOrderTraverse(node.right, values);  
        values.add(node.val);       
​
    }
}
