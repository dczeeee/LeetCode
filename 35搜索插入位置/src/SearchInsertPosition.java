/*
 * ����һ�����������һ��Ŀ��ֵ�����������ҵ�Ŀ��ֵ�������������������Ŀ��ֵ�������������У����������ᱻ��˳������λ�á�

����Լ������������ظ�Ԫ�ء�

ʾ�� 1:

����: [1,3,5,6], 5
���: 2
ʾ�� 2:

����: [1,3,5,6], 2
���: 1
ʾ�� 3:

����: [1,3,5,6], 7
���: 4
ʾ�� 4:

����: [1,3,5,6], 0
���: 0
 */
public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,5,6};
		int target = 7;
		System.out.println(searchInsert(nums, target));
	}
	public static int searchInsert(int[] nums, int target) {
		if(target > nums[nums.length-1])	return nums.length;
        for(int i = 0;i < nums.length; i++) {
        	if(target <= nums[i]) {
        		return i;
        	}
        }
        return 0;
    }
}
