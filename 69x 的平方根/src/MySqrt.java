/*
 * 实现 int sqrt(int x) 函数。

计算并返回 x 的平方根，其中 x 是非负整数。

由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。

示例 1:

输入: 4
输出: 2
示例 2:

输入: 8
输出: 2
说明: 8 的平方根是 2.82842..., 
     由于返回类型是整数，小数部分将被舍去。
 */
public class MySqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 4;
		System.out.println(mySqrt(x));
	}
	public static int mySqrt(int x) {
        for(long i = 0; i<Integer.MAX_VALUE;i++) {
        	if(i*i<=x&&(i+1)*(i+1)>x) {
        		return (int) i;
        	}
        }
        return 0;
    }
}
/*
 * 这是什么神仙操作：
 * public int mySqrt(int x) {
        long t = x;
	t = 0x5f3759df - (t >> 1);
	while (!(t*t <= x && (t+1)*(t+1) > x))
		t = (x/t + t)/2;
	return (int)t;
    }
 */
