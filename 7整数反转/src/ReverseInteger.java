/*
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

示例 1:

输入: 123
输出: 321
 示例 2:

输入: -123
输出: -321
示例 3:

输入: 120
输出: 21
注意:

假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 */
public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(1534236469));
	}
	public static int reverse(int x) {
		String xStr = String.valueOf(x); 
        String result = ""; 
        for (int i = 0 ;i < xStr.length(); i++){ 
            char item = xStr.charAt(i); 
            result = String.valueOf(item) + result; 
        } 
        if (String.valueOf(result.charAt(result.length()-1)).equals("-")){ 
            result = result.substring(0,result.length()-1); 
            result = "-" + result; 
        } 
        Long resultLong = Long.valueOf(result); 
        if (resultLong> 2147483647L || resultLong< -2147483648L){ 
            return 0; 
        } 
        return Integer.valueOf(result) ;
    }
}
