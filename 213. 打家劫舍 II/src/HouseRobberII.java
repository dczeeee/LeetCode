/*
 * ����һ��רҵ��С͵���ƻ�͵���ؽֵķ��ݣ�ÿ�䷿�ڶ�����һ�����ֽ�
 * ����ط����еķ��ݶ�Χ��һȦ������ζ�ŵ�һ�����ݺ����һ�������ǽ����ŵġ�
 * ͬʱ�����ڵķ���װ���໥��ͨ�ķ���ϵͳ������������ڵķ�����ͬһ���ϱ�С͵���룬ϵͳ���Զ�������

����һ������ÿ�����ݴ�Ž��ķǸ��������飬�������ڲ���������װ�õ�����£��ܹ�͵�Ե�����߽�

ʾ�� 1:

����: [2,3,2]
���: 3
����: �㲻����͵�� 1 �ŷ��ݣ���� = 2����Ȼ��͵�� 3 �ŷ��ݣ���� = 2��, ��Ϊ���������ڵġ�
ʾ�� 2:

����: [1,2,3,1]
���: 4
����: �������͵�� 1 �ŷ��ݣ���� = 1����Ȼ��͵�� 3 �ŷ��ݣ���� = 3����
     ͵�Ե�����߽�� = 1 + 3 = 4 ��
 */
public class HouseRobberII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,1};
		System.out.println(rob(nums));
	}
	public static int rob(int[] nums) {
        // ��̬�滮���� 198 ������������޸�
        int n = nums.length;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return nums[0];
        } else if (n == 2) {
            return Math.max(nums[0], nums[1]);
        } else {
            // ���ǲ����� 0 �ŷ���Ͳ����� n-1 �ŷ�������
            return Math.max(rob(nums, 0, n-2), rob(nums, 1, n-1));
        }

    }

    private static int rob(int[] nums, int start, int end) {
        int preMax = nums[start];
        int curMax = Math.max(preMax, nums[start + 1]);
        for (int i = start + 2; i <= end; i++) {
            int temp = curMax;
            curMax = Math.max((preMax +nums[i]), curMax);
            preMax = temp;
        }
        return curMax;
    }
}
