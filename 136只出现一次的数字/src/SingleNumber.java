/*
 * ����һ���ǿ��������飬����ĳ��Ԫ��ֻ����һ�����⣬����ÿ��Ԫ�ؾ��������Ρ��ҳ��Ǹ�ֻ������һ�ε�Ԫ�ء�

˵����

����㷨Ӧ�þ�������ʱ�临�Ӷȡ� ����Բ�ʹ�ö���ռ���ʵ����

ʾ�� 1:

����: [2,2,1]
���: 1
ʾ�� 2:

����: [4,1,2,1,2]
���: 4
 */
public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,1,2,1,2};
		int[] nums1 = {4,1,2,1};
		System.out.println(singleNumber(nums));
		System.out.println(singleNumber(nums1));
		System.out.println(singleNumber(nums)^singleNumber(nums1));
	}
	public static int singleNumber(int[] nums) {
		int single = 0;
        for(int i = 0;i < nums.length; i++){
            single = single ^ nums[i];
        }
        return single;
    }
}
