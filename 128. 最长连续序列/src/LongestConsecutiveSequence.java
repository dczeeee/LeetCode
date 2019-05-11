import java.util.HashSet;
import java.util.Set;

/*
 * ����һ��δ������������飬�ҳ���������еĳ��ȡ�

Ҫ���㷨��ʱ�临�Ӷ�Ϊ O(n)��

ʾ��:

����: [100, 4, 200, 1, 3, 2]
���: 4
����: ����������� [1, 2, 3,4]�����ĳ���Ϊ 4��
 */
public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/*
	 * 
	* �����е�Ԫ��װ��hash Set
	* ����Ԫ�� �����lower Bound ��ǰһ��������set���� ������������еĳ���
	* �������lower Bound �������ɡ�
	* ����ÿ��Ԫ��ֻ���������� 
	* ����ʱ�临�Ӷ�O(n)
	* ���ӣ� 100 4 200 1 3 2
	*       num  isLowerBound sequence length
	*       100  yes          1
	*       4    no 
	*       200  yes          1
	*       1    yes          4 (����1 2 3 4)
	*       3    no
	*       2    no
	*/
	public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (isLowerBound(set, nums[i])){
                int nextNum = nums[i] + 1;
                int count = 1;
                while (set.contains(nextNum)) {
                    count++;
                    nextNum++;
                }
                max = count > max ? count: max;
            }
        }
        return max;
        
    }
    
    private boolean isLowerBound(Set<Integer> set, int num) {
        return !set.contains(num - 1);
    }
}
