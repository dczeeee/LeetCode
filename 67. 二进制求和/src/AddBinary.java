/*
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。

输入为非空字符串且只包含数字 1 和 0。

示例 1:

输入: a = "11", b = "1"
输出: "100"
示例 2:

输入: a = "1010", b = "1011"
输出: "10101"
 */
public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "0";
		String b = "0";
		System.out.println(addBinary(a, b));
	}

	public static String addBinary(String a, String b) {
        int ia = bin2dec(a);
        int ib = bin2dec(b);
        int res = ia + ib;
        return dec2bin(res);
    }
	
	public static int bin2dec(String str) {
		int len = str.length()-1;
		int dec = 0;
		for(int i = len;i >= 0;--i) {
			dec += (str.charAt(i)-'0') * Math.pow(2, len-i);
		}
		return dec;
	}
	
	public static String dec2bin(int i) {
		if(i == 0) return "0";
		StringBuilder sb = new StringBuilder();
		while(i > 0) {
			sb.append(i%2);
			i /= 2;
		}
		return sb.reverse().toString();
	}
}
