/**
 * 给定一个二叉树的根节点 root ，和一个整数 targetSum ，求该二叉树里节点值之和等于 targetSum 的 路径 的数目。
 * <p>
 * 路径 不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * <p>
 * <p>
 * 输入：root = [10,5,-3,3,2,null,11,3,-2,null,1], targetSum = 8
 * 输出：3
 * 解释：和等于 8 的路径有 3 条，如图所示。
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * <p>
 * 输入：root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
 * 输出：3
 * <p>
 * <p>
 * <p>
 * <p>
 * 提示:
 * <p>
 * <p>
 * 二叉树的节点个数的范围是 [0,1000]
 * <p>
 * -10⁹ <= Node.val <= 10⁹
 * -1000 <= targetSum <= 1000
 * <p>
 * <p>
 * Related Topics 树 深度优先搜索 二叉树 👍 2250 👎 0
 */

package leetcode.editor.cn;

public class PathSumIii {
    public static void main(String[] args) {
        Solution solution = new PathSumIii().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

//    public class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//
//        TreeNode() {
//        }
//
//        TreeNode(int val) {
//            this.val = val;
//        }
//
//        TreeNode(int val, TreeNode left, TreeNode right) {
//            this.val = val;
//            this.left = left;
//            this.right = right;
//        }
//    }

    class Solution {
        public int pathSum(TreeNode root, int targetSum) {
            if (root == null) {
                return 0;
            }
            int leftSum = pathSum(root.left, targetSum);
            int rightSum = pathSum(root.right, targetSum);
            return leftSum + rightSum + dfsWithTargetSum(root, targetSum);
        }

        private int dfsWithTargetSum(TreeNode root, long targetSum) {
            if (root == null) {
                return 0;
            }

            int count = (root.val) == targetSum ? 1 : 0;

            int leftCount = dfsWithTargetSum(root.left, targetSum - root.val);
            int rightCount = dfsWithTargetSum(root.right, targetSum - root.val);

            return leftCount + rightCount + count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}