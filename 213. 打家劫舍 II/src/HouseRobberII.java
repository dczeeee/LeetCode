/*
 * 你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。
 * 这个地方所有的房屋都围成一圈，这意味着第一个房屋和最后一个房屋是紧挨着的。
 * 同时，相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。

给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。

示例 1:

输入: [2,3,2]
输出: 3
解释: 你不能先偷窃 1 号房屋（金额 = 2），然后偷窃 3 号房屋（金额 = 2）, 因为他们是相邻的。
示例 2:

输入: [1,2,3,1]
输出: 4
解释: 你可以先偷窃 1 号房屋（金额 = 1），然后偷窃 3 号房屋（金额 = 3）。
     偷窃到的最高金额 = 1 + 3 = 4 。
 */
public class HouseRobberII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,1};
		System.out.println(rob(nums));
	}
	public static int rob(int[] nums) {
        // 动态规划，在 198 号问题基础上修改
        int n = nums.length;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return nums[0];
        } else if (n == 2) {
            return Math.max(nums[0], nums[1]);
        } else {
            // 考虑不抢劫 0 号房间和不抢劫 n-1 号房间的情况
            return Math.max(rob(nums, 0, n-2), rob(nums, 1, n-1));
        }

    }

    private static int rob(int[] nums, int start, int end) {
        int preMax = nums[start];
        int curMax = Math.max(preMax, nums[start + 1]);
        for (int i = start + 2; i <= end; i++) {
            int temp = curMax;
            curMax = Math.max((preMax +nums[i]), curMax);
            preMax = temp;
        }
        return curMax;
    }
}
