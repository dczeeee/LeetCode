/*
 * 设你正在爬楼梯。需要 n 阶你才能到达楼顶。

每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

注意：给定 n 是一个正整数。

示例 1：

输入： 2
输出： 2
解释： 有两种方法可以爬到楼顶。
1.  1 阶 + 1 阶
2.  2 阶
示例 2：

输入： 3
输出： 3
解释： 有三种方法可以爬到楼顶。
1.  1 阶 + 1 阶 + 1 阶
2.  1 阶 + 2 阶
3.  2 阶 + 1 阶
 */
public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		System.out.println(climbStairs(n));
	}
	public static int climbStairs(int n) {
		int[] f = new int[n + 1]; 
		int i; 
		f[0] = 1; 
		f[1] = 2; 
		for(i = 2; i < n; i++){ 
			f[i] = f[i - 1]+ f[i - 2]; 
		} 
		return f[n-1];
    }
}
