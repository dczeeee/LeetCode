/*
 * ����һ�������Ǹ����������һ��Ŀ������ k����дһ���������жϸ������Ƿ��������������飬���С����Ϊ 2���ܺ�Ϊ k �ı��������ܺ�Ϊ n*k������ n Ҳ��һ��������

ʾ�� 1:

����: [23,2,4,6,7], k = 6
���: True
����: [2,4] ��һ����СΪ 2 �������飬���Һ�Ϊ 6��
ʾ�� 2:

����: [23,2,6,4,7], k = 6
���: True
����: [23,2,6,4,7]�Ǵ�СΪ 5 �������飬���Һ�Ϊ 42��
˵��:

����ĳ��Ȳ��ᳬ��10,000��
�������Ϊ���������ܺ��� 32 λ�з���������Χ�ڡ�
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
 * ����ԭ��0.0
 * ִ����ʱ: 703 ms, ��Continuous Subarray Sum��Java�ύ�л�����1.86% ���û�
 */



