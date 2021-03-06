import java.util.Arrays;

/*
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。

说明:

初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
示例:

输入:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

输出: [1,2,2,3,5,6]
 */
public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2,3,0,0,0};
		int m = 3;
		int[] nums2 = {2,5,6}; 
		int n = 3;
		merge(nums1, m, nums2, n);
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m, j = 0;i < nums1.length&&j<n;i++,j++) {
        	nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
        System.out.println(nums1);
    }
}
