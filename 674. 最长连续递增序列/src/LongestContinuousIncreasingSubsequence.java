/*
 * ����һ��δ��������������飬�ҵ���������ĵĵ������С�

ʾ�� 1:

����: [1,3,5,4,7]
���: 3
����: ��������������� [1,3,5], ����Ϊ3��
���� [1,3,5,7] Ҳ�������������, �������������ģ���Ϊ5��7��ԭ�����ﱻ4������ 
ʾ�� 2:

����: [2,2,2,2,2]
���: 1
����: ��������������� [2], ����Ϊ1��
ע�⣺���鳤�Ȳ��ᳬ��10000��
 */
public class LongestContinuousIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,5,7};
		System.out.println(findLengthOfLCIS(nums));
	}
	
	public static int findLengthOfLCIS(int[] nums) {
        int len = nums.length;
        int i = 0;
        int max = 0;
        while(i < len) {
        	int res = 1;
        	for(int j = i;j < len-1;++j) {
        		if(nums[j+1] > nums[j]) {
        			res++;
        		}
        		else {
        			max = res>max ? res :max;
        			break;
        		}
        	}
			max = res>max ? res :max;
        	i++;
        }
        return max;
    }
}
