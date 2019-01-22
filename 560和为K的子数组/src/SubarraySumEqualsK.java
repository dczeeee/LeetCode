/*
 * 给定一个整数数组和一个整数 k，你需要找到该数组中和为 k 的连续的子数组的个数。

示例 1 :

输入:nums = [1,1,1], k = 2
输出: 2 , [1,1] 与 [1,1] 为两种不同的情况。
说明 :

数组的长度为 [1, 20,000]。
数组中元素的范围是 [-1000, 1000] ，且整数 k 的范围是 [-1e7, 1e7]。
 */
public class SubarraySumEqualsK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1};
		int k = 2;
		System.out.println(subarraySum(nums, k));
	}
	public static int subarraySum(int[] nums, int k) {
		int cnt = 0;
		for(int i = 1;i <= nums.length;++i) {
        	for(int j = 0;j <= nums.length-i;++j) {
        		int m = 0;
        		int sum = 0;
        		while(m<i) {
        			sum += nums[j+m];
        			++m;
        		}
	        	if(sum == k) {
		        	++cnt;
		        }
        	}
        }
        return cnt;
    }
}
/*
 * 菜是原罪：超时
 */
