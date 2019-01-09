package Ѱ���������������;
/*
 * ����һ���������͵����� nums�����дһ���ܹ��������顰�����������ķ�����

���������������������������ģ����������������������Ԫ����ӵĺ͵����Ҳ�����Ԫ����ӵĺ͡�

������鲻����������������ô����Ӧ�÷��� -1����������ж��������������ô����Ӧ�÷��������ߵ���һ����

ʾ�� 1:

����: 
nums = [1, 7, 3, 6, 5, 6]
���: 3
����: 
����3 (nums[3] = 6) �������֮��(1 + 7 + 3 = 11)�����Ҳ���֮��(5 + 6 = 11)��ȡ�
ͬʱ, 3 Ҳ�ǵ�һ������Ҫ�������������
ʾ�� 2:

����: 
nums = [1, 2, 3]
���: -1
����: 
�����в��������������������������
 */
public class FindPivotIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,-1,-1,0,1,1};
		System.out.println(pivotIndex(nums));
	}
	public static int pivotIndex(int[] nums) {
        for(int i = 0;i<nums.length;i++) {
        	int left_sum = 0;
			int right_sum = 0;
        	for(int j = 0;j<i;j++) {
        		left_sum += nums[j];
        	}
        	for(int k = i+1;k<nums.length;k++) {
        		right_sum += nums[k];
        	}
        	if(left_sum == right_sum)
        		return i;
        }
        return -1;
    }
}
