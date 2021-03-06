/*
 * 给定一个未经排序的整数数组，找到最长且连续的的递增序列。

示例 1:

输入: [1,3,5,4,7]
输出: 3
解释: 最长连续递增序列是 [1,3,5], 长度为3。
尽管 [1,3,5,7] 也是升序的子序列, 但它不是连续的，因为5和7在原数组里被4隔开。 
示例 2:

输入: [2,2,2,2,2]
输出: 1
解释: 最长连续递增序列是 [2], 长度为1。
注意：数组长度不会超过10000。
 */
public class LongestContinuousIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,5,7};
		System.out.println(findLengthOfLCIS(nums));
	}
	
	public static int findLengthOfLCIS(int[] nums) {
        int len = nums.length;
        int i = 0;
        int max = 0;
        while(i < len) {
        	int res = 1;
        	for(int j = i;j < len-1;++j) {
        		if(nums[j+1] > nums[j]) {
        			res++;
        		}
        		else {
        			max = res>max ? res :max;
        			break;
        		}
        	}
			max = res>max ? res :max;
        	i++;
        }
        return max;
    }
}
