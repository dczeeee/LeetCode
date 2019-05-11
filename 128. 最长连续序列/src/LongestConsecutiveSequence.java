import java.util.HashSet;
import java.util.Set;

/*
 * 给定一个未排序的整数数组，找出最长连续序列的长度。

要求算法的时间复杂度为 O(n)。

示例:

输入: [100, 4, 200, 1, 3, 2]
输出: 4
解释: 最长连续序列是 [1, 2, 3,4]。它的长度为 4。
 */
public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/*
	 * 
	* 将所有的元素装入hash Set
	* 遍历元素 如果是lower Bound （前一个数不在set）中 往后找最大序列的长度
	* 如果不是lower Bound 跳过即可。
	* 这样每个元素只会变访问两次 
	* 总体时间复杂度O(n)
	* 例子： 100 4 200 1 3 2
	*       num  isLowerBound sequence length
	*       100  yes          1
	*       4    no 
	*       200  yes          1
	*       1    yes          4 (访问1 2 3 4)
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
