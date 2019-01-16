/*
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。

你可以假设数组是非空的，并且给定的数组总是存在众数。

示例 1:

输入: [3,2,3]
输出: 3
示例 2:

输入: [2,2,1,1,1,2,2]
输出: 2
 */
public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,2,1,1,1,2,2};
		System.out.println(majorityElement(nums));
	}
	public static int majorityElement(int[] nums) {
        int cnt = 1;
        int maj = nums[0];
        for(int i = 1;i <nums.length;i++) {
        	if(maj == nums[i])
        		cnt ++;
        	else {
        		cnt --;
        		if(cnt == 0) {
        			maj = nums[i+1];
        		}
        	}
        }
        return maj;
    }
}
