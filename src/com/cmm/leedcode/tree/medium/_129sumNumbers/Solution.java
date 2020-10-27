package com.cmm.leedcode.tree.medium._129sumNumbers;

import com.cmm.leedcode.tree.TreeNode;

/**
 * @author caimingming02
 * @date 2020/10/26 9:44 AM
 * @desc Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
 *
 * An example is the root-to-leaf path 1->2->3 which represents the number 123.
 *
 * Find the total sum of all root-to-leaf numbers.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Input: [1,2,3]
 *     1
 *    / \
 *   2   3
 * Output: 25
 * Explanation:
 * The root-to-leaf path 1->2 represents the number 12.
 * The root-to-leaf path 1->3 represents the number 13.
 * Therefore, sum = 12 + 13 = 25.
 * Example 2:
 *
 * Input: [4,9,0,5,1]
 *     4
 *    / \
 *   9   0
 *  / \
 * 5   1
 * Output: 1026
 * Explanation:
 * The root-to-leaf path 4->9->5 represents the number 495.
 * The root-to-leaf path 4->9->1 represents the number 491.
 * The root-to-leaf path 4->0 represents the number 40.
 * Therefore, sum = 495 + 491 + 40 = 1026.
 */
public class Solution {
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int val) {
        if (root == null) {
            return 0;
        }
        val = val * 10 + root.val;
        return root.left == null && root.right == null ? val : dfs(root.left, val) + dfs(root.right, val);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode l=new TreeNode(2);
        TreeNode r=new TreeNode(3);
        root.left=l;
        root.right=r;
        new Solution().sumNumbers(root);

    }


}
