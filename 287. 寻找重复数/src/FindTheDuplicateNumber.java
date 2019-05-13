/*
 * ����һ������ n + 1 ������������ nums�������ֶ��� 1 �� n ֮�䣨���� 1 �� n������֪���ٴ���һ���ظ���������
 * ����ֻ��һ���ظ����������ҳ�����ظ�������

ʾ�� 1:

����: [1,3,4,2,2]
���: 2
ʾ�� 2:

����: [3,1,3,4,2]
���: 3
˵����

���ܸ���ԭ���飨����������ֻ���ģ���
ֻ��ʹ�ö���� O(1) �Ŀռ䡣
ʱ�临�Ӷ�С�� O(n2) ��
������ֻ��һ���ظ������֣��������ܲ�ֹ�ظ�����һ�Ρ�
 */
public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,4,2,2};
		System.out.println(findDuplicate(nums));
	}

	public static int findDuplicate(int[] nums) {
		// һ�α��������赱ǰ����Ϊi����ô�Ͱ�nums[i]�����ֱ�Ϊ�����������ʵ�������Ӧ����Ϊ����ʱ����Ϊ�ظ�����
		for(int i = 0 ; i< nums.length ; i++){
            int index = Math.abs(nums[i]);
            if(nums[index] < 0){
                return Math.abs(nums[i]);
            }else
                nums[index] = -nums[index];
        }
        return 0;
    }
}
