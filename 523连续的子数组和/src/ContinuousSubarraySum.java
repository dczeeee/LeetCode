/*
 * 给定一个包含非负数的数组和一个目标整数 k，编写一个函数来判断该数组是否含有连续的子数组，其大小至少为 2，总和为 k 的倍数，即总和为 n*k，其中 n 也是一个整数。

示例 1:

输入: [23,2,4,6,7], k = 6
输出: True
解释: [2,4] 是一个大小为 2 的子数组，并且和为 6。
示例 2:

输入: [23,2,6,4,7], k = 6
输出: True
解释: [23,2,6,4,7]是大小为 5 的子数组，并且和为 42。
说明:

数组的长度不会超过10,000。
你可以认为所有数字总和在 32 位有符号整数范围内。
 */
public class ContinuousSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {23,2,6,4,7};
		int k = 6;
		System.out.println(checkSubarraySum(nums, k));
	}
	public static boolean checkSubarraySum(int[] nums, int k) {
		for(int i = 2;i <= nums.length;++i) {
        	for(int j = 0;j <= nums.length-i;++j) {
        		int m = 0;
        		int sum = 0;
        		while(m<i) {
        			sum += nums[j+m];
        			++m;
        		}
                if(sum == 0)    return true;
        		if(k!=0 && sum%k == 0) {
        			return true;
        		}
        	}
        }
        return false;
    }
}
/*
 * 菜是原罪0.0
 * 执行用时: 703 ms, 在Continuous Subarray Sum的Java提交中击败了1.86% 的用户
 */



