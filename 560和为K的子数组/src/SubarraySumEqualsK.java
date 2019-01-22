/*
 * ����һ�����������һ������ k������Ҫ�ҵ��������к�Ϊ k ��������������ĸ�����

ʾ�� 1 :

����:nums = [1,1,1], k = 2
���: 2 , [1,1] �� [1,1] Ϊ���ֲ�ͬ�������
˵�� :

����ĳ���Ϊ [1, 20,000]��
������Ԫ�صķ�Χ�� [-1000, 1000] �������� k �ķ�Χ�� [-1e7, 1e7]��
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
 * ����ԭ���ʱ
 */
