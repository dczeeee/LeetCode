/*
 * ����һ������ n ���������������һ�������� s ���ҳ���������������� �� s �ĳ�����С�����������顣��������ڷ������������������飬���� 0��

ʾ��: 

����: s = 7, nums = [2,3,1,2,4,3]
���: 2
����: ������ [4,3] �Ǹ������µĳ�����С�����������顣
����:

������Ѿ������O(n) ʱ�临�ӶȵĽⷨ, �볢�� O(n log n) ʱ�临�ӶȵĽⷨ��
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
