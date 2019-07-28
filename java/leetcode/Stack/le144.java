package leetcode.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个二叉树，返回它的 前序 遍历。
 */
public class le144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (p != null || !stack.isEmpty()) {
            if (p != null) {
                list.add(p.val);
                stack.push(p);
                p = p.left;
            }
            else {
                p = stack.pop();
                p = p.right;
            }
        }
        return list;
    }
}

