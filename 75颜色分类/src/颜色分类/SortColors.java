package ��ɫ����;
/*
 * ����һ��������ɫ����ɫ����ɫ��һ�� n ��Ԫ�ص����飬ԭ�ض����ǽ�������
 * ʹ����ͬ��ɫ��Ԫ�����ڣ������պ�ɫ����ɫ����ɫ˳�����С�

�����У�����ʹ������ 0�� 1 �� 2 �ֱ��ʾ��ɫ����ɫ����ɫ��

ע��:
����ʹ�ô�����е����������������⡣

ʾ��:

����: [2,0,2,1,1,0]
���: [0,0,1,1,2,2]
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

/* ����˼·��
 * 0��1��2 ����һ�α����������0�����ƶ�����ͷ�������2�����ƶ�����β�����ÿ���1��0��2�����꣬1�����д���
 */
