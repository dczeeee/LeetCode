/*
 * ����һ���������飬�ж��Ƿ�����ظ�Ԫ�ء�

����κ�ֵ�������г����������Σ��������� true�����������ÿ��Ԫ�ض�����ͬ���򷵻� false��

ʾ�� 1:

����: [1,2,3,1]
���: true
ʾ�� 2:

����: [1,2,3,4]
���: false
ʾ�� 3:

����: [1,1,1,3,3,4,3,2,4,2]
���: true
 */
public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1,3,3,4,3,2,4,2};
		System.out.println(containsDuplicate(nums));
	}
	public static boolean containsDuplicate(int[] nums) {
        for(int i = 0; i < nums.length;i++) {
        	for(int j = 0;j < nums.length && j != i;j++) {
        		if(nums[i] == nums[j]) {
        			return true;
        		}
        	}
        }
        return false;
    }
}
