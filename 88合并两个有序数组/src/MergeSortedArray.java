import java.util.Arrays;

/*
 * �������������������� nums1 �� nums2���� nums2 �ϲ��� nums1 �У�ʹ�� num1 ��Ϊһ���������顣

˵��:

��ʼ�� nums1 �� nums2 ��Ԫ�������ֱ�Ϊ m �� n��
����Լ��� nums1 ���㹻�Ŀռ䣨�ռ��С���ڻ���� m + n�������� nums2 �е�Ԫ�ء�
ʾ��:

����:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

���: [1,2,2,3,5,6]
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
