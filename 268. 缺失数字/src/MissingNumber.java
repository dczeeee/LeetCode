/*
 * ����һ������ 0, 1, 2, ..., n �� n ���������У��ҳ� 0 .. n ��û�г����������е��Ǹ�����

ʾ�� 1:

����: [3,0,1]
���: 2
ʾ�� 2:

����: [9,6,4,2,3,5,7,0,1]
���: 8
˵��:
����㷨Ӧ��������ʱ�临�Ӷȡ����ܷ��ʹ�ö��ⳣ���ռ���ʵ��?
 */
public class MissingNumber {
	
	public static void main(String[] args) {
		int[] nums = {3,0,1};
		System.out.println(missingNumber(nums));
	}
	
	public static int missingNumber(int[] nums) {
		int sum = 0;
		int curSum = 0;
        for(int i = 0;i < nums.length;++i) {
        	sum += i;
        	curSum += nums[i];
        }
        sum += nums.length;
        return sum-curSum;
    }
}
