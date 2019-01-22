/*
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续子数组。如果不存在符合条件的连续子数组，返回 0。

示例: 

输入: s = 7, nums = [2,3,1,2,4,3]
输出: 2
解释: 子数组 [4,3] 是该条件下的长度最小的连续子数组。
进阶:

如果你已经完成了O(n) 时间复杂度的解法, 请尝试 O(n log n) 时间复杂度的解法。
 */
public class MinimumSizeSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 7;
		int[] nums = {2,3,1,2,4,3};
		System.out.println(minSubArrayLen(s, nums));
	}
	public static int minSubArrayLen(int s, int[] nums) {
        for(int i = 1;i <= nums.length;++i) {
        	for(int j = 0;j <= nums.length-i;++j) {
        		int k = 0;
        		int sum = 0;
        		while(k<i) {
        			sum += nums[j+k];
        			++k;
        		}
	        	if(sum >= s) {
		        	return i;
		        }
        	}
        }
        return 0;
    }
}
