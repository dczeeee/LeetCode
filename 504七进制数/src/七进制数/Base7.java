package 七进制数;

/*
 * 给定一个整数，将其转化为7进制，并以字符串形式输出。

示例 1:

输入: 100
输出: "202"
示例 2:

输入: -7
输出: "-10"
注意: 输入范围是 [-1e7, 1e7] 。
 */

public class Base7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertToBase7(100));
		System.out.println(convertToBase7(-49));
		System.out.println(convertToBase7(-8));
	}
	public static String convertToBase7(int num) {
		String str=new String();
		StringBuffer sb = new StringBuffer(str);
		int i = 0;
		while(Math.abs(num)>=7) {
			i = num%7;
			num /= 7;
			sb.insert(0,Math.abs(i));
		}
		if(num<7) {
			sb.insert(0,num);
		}
        return sb.toString();
    }
}
