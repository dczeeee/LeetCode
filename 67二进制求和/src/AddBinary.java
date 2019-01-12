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
		String a = "1010";
		String b = "1011";
		System.out.println(addBinary(a, b));
	}
	public static String addBinary(String a, String b) {
        int la = a.length();
        int lb = b.length();
        int len = Math.max(la, lb);
        return "我再想想";
    }
}
