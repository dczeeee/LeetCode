package 颜色分类;
/*
 * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，
 * 使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。

此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。

注意:
不能使用代码库中的排序函数来解决这道题。

示例:

输入: [2,0,2,1,1,0]
输出: [0,0,1,1,2,2]
 */
public class SortColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,0,2,1,1,0};
		sortColors(nums);
	}
	public static void sortColors(int[] nums) {
        for(int i = 0;i < nums.length-1;i++) {
        	for(int j = i+1;j<nums.length;j++) {
        		if(nums[i]>nums[j]) {
        			int tmp = nums[j];
        			nums[j]=nums[i];
        			nums[i]=tmp;
        		}
        	}
        }
        System.out.println(nums);
    }
}

/* 大佬思路：
 * 0，1，2 排序。一次遍历，如果是0，则移动到表头，如果是2，则移动到表尾，不用考虑1。0和2处理完，1还会有错吗？
 */
