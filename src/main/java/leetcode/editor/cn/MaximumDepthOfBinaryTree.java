/**
 * 给定一个二叉树 root ，返回其最大深度。
 * <p>
 * 二叉树的 最大深度 是指从根节点到最远叶子节点的最长路径上的节点数。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * 输入：root = [3,9,20,null,null,15,7]
 * 输出：3
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：root = [1,null,2]
 * 输出：2
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * <p>
 * 树中节点的数量在 [0, 10⁴] 区间内。
 * -100 <= Node.val <= 100
 * <p>
 * <p>
 * Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 2085 👎 0
 */

package leetcode.editor.cn;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        Solution solution = new MaximumDepthOfBinaryTree().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }

//            int depth = 0;
//            Queue<TreeNode> queue = new LinkedList<>();
//            queue.offer(root);
//
//            while(!queue.isEmpty()) {
//                depth++;
//                int size = queue.size();
//                for (int i = 0; i < size; i++) {
//                    TreeNode node = queue.poll();
//                    if (node.left != null) {
//                        queue.offer(node.left);
//                    }
//                    if (node.right != null) {
//                        queue.offer(node.right);
//                    }
//                }
//            }

            int left = maxDepth(root.left);
            int right = maxDepth(root.right);

            return 1 + Math.max(left, right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}