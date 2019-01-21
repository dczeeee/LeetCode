/*
 * 给定一个非负整数 N，找出小于或等于 N 的最大的整数，同时这个整数需要满足其各个位数上的数字是单调递增。

（当且仅当每个相邻位数上的数字 x 和 y 满足 x <= y 时，我们称这个整数是单调递增的。）

示例 1:

输入: N = 10
输出: 9
示例 2:

输入: N = 1234
输出: 1234
示例 3:

输入: N = 332
输出: 299
说明: N 是在 [0, 10^9] 范围内的一个整数。

在真实的面试中遇到过这道题？
 */
public class MonotoneIncreasingDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 332;
		System.out.println(monotoneIncreasingDigits(N));
	}
	public static int monotoneIncreasingDigits(int N) {
        for(int i = N;i >= 0;--i) {
        	StringBuffer sb = new StringBuffer(String.valueOf(i));
        	if(sb.length() == 1)
        		return i;
        	int flag = 1;
        	for(int j = sb.length()-1;j > 0;--j) {
        		if(sb.charAt(j) >= sb.charAt(j-1)) {
        			flag ++;
        		}
        		if(flag == sb.length()) {
        			return i;
        		}
        	}
        }
        return 0;
    }
}
